package com.ncr.nis.ext.catalogue.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ncr.nis.ext.catalogue.mappers.GetStoreFromFileName;
import com.ncr.nis.ext.catalogue.mappers.HierarchyMap;


@Component
public class HierarchiesToGenericRouteBuilder extends RouteBuilder {

    @Autowired
    private CamelContext context;

    @Autowired
    private HierarchyMap mapToGeneric;
    
    @Autowired
    private GetStoreFromFileName getStoreFromFileName;

    @Override
    public void configure() {

        // Route "SapCatalogHierarchies"
        from("file:{{SapCatalog.HierarchiesIn}}?moveFailed=Failed/${date:now:yyyyMMddHHmmssSSS}_${file:name}&include=^dept_.*\\.xml")
                .routeId("SapCatalogHierarchies")
                .setProperty("NisBspService", constant("CategoryNodesUpdate"))
                .log(">>> SAP Hierarchies: got file \"${file:name}\"") 
                .bean(getStoreFromFileName, "getStoreFromFileName(${exchange},${file:name})")
                .log(">>> SAP Hierarchies: store number \"${headers.StoreNumber}\"") 
                .log(">>> Main Stores List {{SendToBSP.MainStoresList}}")
                .filter(simple("${headers.StoreNumber} in {{SendToBSP.MainStoresList:,}}"))
                .bean(mapToGeneric, "mapToGeneric(${exchange})")                
                .log(">>> SAP Hierarchies: finished file ${file:name}")
                .to("direct:BspGenericRoute")
               
        ;
    }
}
