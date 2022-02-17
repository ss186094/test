package com.ncr.nis.ext.catalogue.models.hierarchy;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Node {
	
	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private String ParentNodeID;
	
	@JacksonXmlProperty
	private String NodeID;
	
	@JacksonXmlProperty
	private String NodeCode;
	
	@JacksonXmlProperty
	private String NodeLevelName;
	
	@JacksonXmlProperty
	private String LongDescription;
	

	

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}
	
	

	
	

	public String getParentNodeID() {
		return ParentNodeID;
	}

	public void setParentNodeID(String parentNodeID) {
		ParentNodeID = parentNodeID;
	}

	public String getNodeID() {
		return NodeID;
	}

	public void setNodeID(String nodeID) {
		NodeID = nodeID;
	}

	public String getNodeCode() {
		return NodeCode;
	}

	public void setNodeCode(String nodeCode) {
		NodeCode = nodeCode;
	}

	public String getNodeLevelName() {
		return NodeLevelName;
	}

	public void setNodeLevelName(String nodeLevelName) {
		NodeLevelName = nodeLevelName;
	}

	public String getLongDescription() {
		return LongDescription;
	}

	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}

	@Override
	public String toString() {
		return "Node [Action=" + Action + ", ParentNodeID=" + ParentNodeID + ", NodeID=" + NodeID + ", NodeCode="
				+ NodeCode + ", NodeLevelName=" + NodeLevelName + ", LongDescription=" + LongDescription + "]";
	}
	
	
	
	
	
	

}













