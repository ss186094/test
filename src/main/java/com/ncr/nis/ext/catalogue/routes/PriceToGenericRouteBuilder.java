package com.ncr.nis.ext.catalogue.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ncr.nis.ext.catalogue.mappers.GetStoreFromFileName;
import com.ncr.nis.ext.catalogue.mappers.PriceMap;

@Component
public class PriceToGenericRouteBuilder extends RouteBuilder{
	
	@Autowired
	private CamelContext context;

	@Autowired	
	private PriceMap mapToGeneric;
	
    @Autowired
    private GetStoreFromFileName getStoreFromFileName;
    
    @Override
	public void configure() {

		// Route "Sap Product"
		from("file:{{SapCatalog.PricesIn}}?moveFailed=Failed/${date:now:yyyyMMddHHmmssSSS}_${file:name}&include=^plu_*.*\\.xml")
				.routeId("SapProduct").setProperty("NisBspService", constant("ProductUpdate"))
				.log(">>> SAP Product: got file \"${file:name}\"")
				.bean(getStoreFromFileName, "getStoreFromFileName(${exchange},${file:name})")
				.log(">>> SAP Items: store number \"${headers.StoreNumber}\"") 
                .log(">>> Main Stores List: {{SendToBSP.MainStoresList}}")
                .log(">>> Map Prices:  {{SendToBSP.SendPrices}}")
                .filter( simple("${headers.StoreNumber} in {{SendToBSP.MainStoresList:,}} || {{SendToBSP.SendPrices}} =~ 'true'"))          
				.bean(mapToGeneric, "mapToGeneric(${exchange})")
				.log(">>> SAP Product: finished file ${file:name}")
				.to("direct:BspGenericRoute");
				
				
	}
    
    


}
