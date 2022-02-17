package com.ncr.nis.ext.catalogue.mappers;

import java.io.IOException;
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

import com.ncr.nis.generic.mappers.GenericMapperAbstract;
import com.ncr.nis.generic.mappers.HierarchyMapperHelper;

import com.ncr.nis.generic.model.HierData;

public class HierarchyMap extends GenericMapperAbstract{
	
	private final static Logger logger = LoggerFactory.getLogger(HierarchyMap.class);
	
	public Hierarchy deserializeXml(String msgIn) throws IOException {
		ObjectMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Hierarchy sapHierarchy = xmlMapper.readValue(msgIn, Hierarchy.class);
		return sapHierarchy;

	}
	
	private List<Node> parseInput(String msg) throws IOException{
		
		Hierarchy saphierarchy=null;
		try {
			saphierarchy = deserializeXml(msg);
		} catch (IOException e1) {
			logger.error("Can not parse input file");
			e1.printStackTrace();
			throw e1;
		}
		List<Node> list=null;
		try {
			list=saphierarchy.getNode();
		} catch (Exception e) {
			logger.error("Invalid XML Does not have tag <Node>");
			e.printStackTrace();
			throw e;
		}
		return list;
	}
	public Map<String, Map<String, Map<String, String>>> mapToGeneric(Exchange exchange) throws IOException {
		Map<String, Object> headers = this.initMapper(exchange, this);
		List<Node> list = parseInput(exchange.getIn().getBody(String.class));
		HierarchyMapperHelper hireHelper=new HierarchyMapperHelper();
		for(Node i:list) {
			HierData output = HierarchyMapperHelper.newElementBuilder();
			output.setParentId(i.getParentNodeID());
			output.setNodeId(i.getNodeID());
			output.setDescription(i.getLongDescription());
			output.setHierarchyName(i.getNodeLevelName());
			hireHelper.addElement(output);
		}

		return hireHelper.getReturnElemets();
	}
	
	
	
	
	
	
	
	

}
