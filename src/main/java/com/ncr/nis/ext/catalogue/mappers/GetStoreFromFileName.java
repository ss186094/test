package com.ncr.nis.ext.catalogue.mappers;

import java.util.Map;

import org.apache.camel.Exchange;

public class GetStoreFromFileName {
	
	public void getStoreFromFileName(Exchange exchange,String fileName) {

		Map<String, Object> headers = exchange.getIn().getHeaders();
		// String fileName = (String) headers.get("CamelFileName");
		String[] fileNameSplitter = fileName.split("_");

		// get store number from file name : 447 for ex when :
		// dept_201907050400_104779086_447.xml
		String storeNumber = (fileNameSplitter[(fileNameSplitter.length) - 1]).substring(0,
				fileNameSplitter[(fileNameSplitter.length) - 1].indexOf('.'));
		headers.put("StoreNumber", storeNumber);
	}


}
