package com.ncr.nis.ext.catalogue.models.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SalesRestriction {

	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private int Identifier;
	
	@JacksonXmlProperty
	private String Description;

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	

	public int getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(int identifier) {
		Identifier = identifier;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "SalesRestriction [Action=" + Action + ", Identifier=" + Identifier + ", Description=" + Description
				+ "]";
	}
	
	
}
