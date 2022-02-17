package com.ncr.nis.ext.catalogue.models.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BarCode {
	
	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private double Identifier;
	
	@JacksonXmlProperty
	private String IdentifierType;
	
	@JacksonXmlProperty
	private boolean PrimaryIndicator;
	
	@JacksonXmlProperty
	private double RmsPlud;

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getIdentifierType() {
		return IdentifierType;
	}

	public void setIdentifierType(String identifierType) {
		IdentifierType = identifierType;
	}

	

	public double getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(double identifier) {
		Identifier = identifier;
	}

	public boolean isPrimaryIndicator() {
		return PrimaryIndicator;
	}

	public void setPrimaryIndicator(boolean primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}

	public double getRmsPlud() {
		return RmsPlud;
	}

	public void setRmsPlud(double rmsPlud) {
		RmsPlud = rmsPlud;
	}

	@Override
	public String toString() {
		return "BarCode [Action=" + Action + ", Identifier=" + Identifier + ", IdentifierType=" + IdentifierType
				+ ", PrimaryIndicator=" + PrimaryIndicator + ", RmsPlud=" + RmsPlud + "]";
	}
	
	

}
