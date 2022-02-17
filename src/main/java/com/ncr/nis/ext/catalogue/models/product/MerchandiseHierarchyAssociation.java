package com.ncr.nis.ext.catalogue.models.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MerchandiseHierarchyAssociation {
	
	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private String NodeID;

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getNodeID() {
		return NodeID;
	}

	public void setNodeID(String nodeID) {
		NodeID = nodeID;
	}

	@Override
	public String toString() {
		return "MerchandiseHierarchyAssociation [Action=" + Action + ", NodeID=" + NodeID + "]";
	}
	
	

}
