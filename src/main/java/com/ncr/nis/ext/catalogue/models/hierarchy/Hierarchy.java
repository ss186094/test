package com.ncr.nis.ext.catalogue.models.hierarchy;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Hierarchy {
		
	@JacksonXmlProperty
	private String HierarchyName;
	
	@JacksonXmlProperty
	private String Version;
	
	@JacksonXmlProperty
	private String BatchNumber;
	
	@JacksonXmlProperty
	private Date BatchTimeStamp;
	
	@JacksonXmlProperty
	private String InterfaceName;
	
	@JacksonXmlProperty
	private List<Node> Node;
	
	
	
	

	public String getHierarchyName() {
		return HierarchyName;
	}

	public void setHierarchyName(String hierarchyName) {
		HierarchyName = hierarchyName;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getBatchNumber() {
		return BatchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		BatchNumber = batchNumber;
	}

	
	public Date getBatchTimeStamp() {
		return BatchTimeStamp;
	}

	public void setBatchTimeStamp(Date batchTimeStamp) {
		BatchTimeStamp = batchTimeStamp;
	}

	public String getInterfaceName() {
		return InterfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		InterfaceName = interfaceName;
	}

	public List<Node> getNode() {
		return Node;
	}

	public void setNode(List<Node> node) {
		Node = node;
	}

	@Override
	public String toString() {
		return "Hierarchy [HierarchyName=" + HierarchyName + ", Version=" + Version + ", BatchNumber=" + BatchNumber
				+ ", BatchTimeStamp=" + BatchTimeStamp + ", InterfaceName=" + InterfaceName + ", Node=" + Node + "]";
	}
	
	
	
	
	
}
