package com.ncr.nis.ext.catalogue.mappers;

import java.io.IOException;
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
import com.ncr.nis.ext.catalogue.models.price.Price;
import com.ncr.nis.ext.catalogue.models.price.PriceDetail;
import com.ncr.nis.generic.mappers.GenericMapperAbstract;
import com.ncr.nis.generic.mappers.PriceMapperHelper;
import com.ncr.nis.generic.model.PriceData;

public class PriceMap extends GenericMapperAbstract{

	private final static Logger logger = LoggerFactory.getLogger(HierarchyMap.class);
	
	
	public Price deserializeXml(String msgIn) throws IOException {
		ObjectMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Price sapPrice = xmlMapper.readValue(msgIn, Price.class);
		return sapPrice;

	}
	private List<PriceDetail> parseInput(String msg) throws IOException{
		
		Price sapPrice=null;
		try {
			sapPrice = deserializeXml(msg);
		} catch (IOException e1) {
			logger.error("Can not parse input file");
			e1.printStackTrace();
			throw e1;
		}
		List<PriceDetail> list=null;
		try {
			list=sapPrice.getPriceDetail();
		} catch (Exception e) {
			logger.error("Invalid XML Does not have tag <Node>");
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	public Map<String,Object> mapToGeneric(Exchange exchange)throws IOException{
		List<PriceDetail> list=parseInput(exchange.getIn().getBody(String.class));
		Map<String, Object> headers = this.initMapper(exchange, this);
		String storeNumber = getStoreNumber(headers);
		PriceMapperHelper pricehelper=new PriceMapperHelper();
		for(PriceDetail i:list) {
			PriceData output=PriceMapperHelper.newPriceBuilder();
			output.setPrice(i.getPriceEventDetail().getSellingPrice());
			//output.setStartDateTime(i.getPriceEventDetail().getEffectiveTimeStamp());
			output.setPriceCode(i.getPriceEventDetail().getPriceChangeID());
			output.setItemId(i.getProduct());
			pricehelper.addPrice(output);
		}
		Map<String,Object> out=new HashMap<>();
		Map<String,Map<String,List<Map<String,String>>>> outPrice=pricehelper.getReturnPrice(headers, storeNumber);
		out.put(PriceMapperHelper.getMainTag(), outPrice);
		return out;
	}
	
	private String getStoreNumber(Map<String, Object> headers) {
		String fileName = (String) headers.get("CamelFileName");
		String[] fileNameSplitter = fileName.split("_");

		String storeNumber = (fileNameSplitter[(fileNameSplitter.length) - 1]).substring(0,
				fileNameSplitter[(fileNameSplitter.length) - 1].indexOf('.'));

		return storeNumber;
	}
}
