package com.ncr.nis.ext.catalogue.models.price;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PriceEventDetail {
	
	@JacksonXmlProperty
	private String PriceTypeCode;
	
	@JacksonXmlProperty
	private String PriceTypeDescription;
	@JacksonXmlProperty
	private String PriceChangeID;
	
	@JacksonXmlProperty
	private String EffectiveTimeStamp;
	
	@JacksonXmlProperty
	private String NormalPrice;
	
	@JacksonXmlProperty
	private String UnitOfMeasure;
	
	@JacksonXmlProperty
	private String SellingPrice;

	public String getPriceTypeCode() {
		return PriceTypeCode;
	}

	public void setPriceTypeCode(String priceTypeCode) {
		PriceTypeCode = priceTypeCode;
	}

	public String getPriceTypeDescription() {
		return PriceTypeDescription;
	}

	public void setPriceTypeDescription(String priceTypeDescription) {
		PriceTypeDescription = priceTypeDescription;
	}

	public String getPriceChangeID() {
		return PriceChangeID;
	}

	public void setPriceChangeID(String priceChangeID) {
		PriceChangeID = priceChangeID;
	}

	public String getEffectiveTimeStamp() {
		return EffectiveTimeStamp;
	}

	public void setEffectiveTimeStamp(String effectiveTimeStamp) {
		EffectiveTimeStamp = effectiveTimeStamp;
	}

	public String getNormalPrice() {
		return NormalPrice;
	}

	public void setNormalPrice(String normalPrice) {
		NormalPrice = normalPrice;
	}

	public String getUnitOfMeasure() {
		return UnitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure = unitOfMeasure;
	}

	public String getSellingPrice() {
		return SellingPrice;
	}

	public void setSellingPrice(String sellingPrice) {
		SellingPrice = sellingPrice;
	}

	@Override
	public String toString() {
		return "PriceEventDetail [PriceTypeCode=" + PriceTypeCode + ", PriceTypeDescription=" + PriceTypeDescription
				+ ", PriceChangeID=" + PriceChangeID + ", EffectiveTimeStamp=" + EffectiveTimeStamp + ", NormalPrice="
				+ NormalPrice + ", UnitOfMeasure=" + UnitOfMeasure + ", SellingPrice=" + SellingPrice + "]";
	}
	
	
	
	

}
