package com.ncr.nis.ext.catalogue.mappers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ncr.nis.ext.catalogue.models.hierarchy.Hierarchy;
import com.ncr.nis.ext.catalogue.models.hierarchy.Node;
import com.ncr.nis.ext.catalogue.models.product.BarCode;
import com.ncr.nis.ext.catalogue.models.product.Product;
import com.ncr.nis.generic.mappers.GenericMapperAbstract;
import com.ncr.nis.generic.mappers.ProductMapperHelper;
import com.ncr.nis.generic.model.ProductData;

public class ProductsMap extends GenericMapperAbstract{
	private final static Logger logger = LoggerFactory.getLogger(ProductsMap.class);
	
	public Product deserializeXml(String msgIn) throws IOException {
		ObjectMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Product sapProduct = xmlMapper.readValue(msgIn, Product.class);
		return sapProduct;

	}
	
	private Product parseInput(String msg) throws IOException{
		
		Product sapProduct=null;
		try {
			sapProduct = deserializeXml(msg);
		} catch (IOException e1) {
			logger.error("Can not parse input file");
			e1.printStackTrace();
			throw e1;
		}
		
		return sapProduct;
	}
	public Map<String,Object> mapToGeneric(Exchange exchange) throws IOException{
		Map<String,Object> headers=initMapper(exchange,this);
		Product sapProduct= parseInput(exchange.getIn().getBody(String.class));
		ProductMapperHelper prodhelper=new ProductMapperHelper();
		ProductData output=mapItem(sapProduct);
		prodhelper.addProduct(output);
		Map<String,Object> out=new HashMap<>();
		Map<String,Map<String,Map<String,Object>>> outProd=prodhelper.getReturnProduct(headers);
		out.put(ProductMapperHelper.getMainTag(), outProd);
		return out;
	}
	
	private ProductData mapItem(Product input) {
		
		ProductData output=ProductMapperHelper.newProductBuilder();
		output.setItemId(input.getProductID());
		
		output.setItemShortDescription(input.getShortDescription());
		List<String> barcode=new ArrayList<>();
		if(input.getBarCode()!=null) {
			for(BarCode i:input.getBarCode()) {
				barcode.add(i.getIdentifierType());
				
			}
		}
		output.setBarcodes(barcode);
		if(input.getAction().equals("Delete")) {
			output.setStatus("INACTIVE");
		}
		else {
			output.setStatus("ACTIVE");
		}
		
		return output;
		
	}
}
