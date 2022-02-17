package com.ncr.nis.ext.catalogue.models.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AdditionalData {
	
	@JacksonXmlProperty
	private Ticketing Ticketing;

	public Ticketing getTicketing() {
		return Ticketing;
	}

	public void setTicketing(Ticketing ticketing) {
		Ticketing = ticketing;
	}

	@Override
	public String toString() {
		return "AdditionalData [Ticketing=" + Ticketing + "]";
	}
	
	

}
