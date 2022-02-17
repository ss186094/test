package com.ncr.nis.ext.catalogue.models.price;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PriceDetail {

	
	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private String Product;
	
	@JacksonXmlProperty
	private String DeleteaAllPriceRecords;
	
	@JacksonXmlProperty
	private PriceEventDetail PriceEventDetail;

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getDeleteaAllPriceRecords() {
		return DeleteaAllPriceRecords;
	}

	public void setDeleteaAllPriceRecords(String deleteaAllPriceRecords) {
		DeleteaAllPriceRecords = deleteaAllPriceRecords;
	}

	public PriceEventDetail getPriceEventDetail() {
		return PriceEventDetail;
	}

	public void setPriceEventDetail(PriceEventDetail priceEventDetail) {
		PriceEventDetail = priceEventDetail;
	}

	@Override
	public String toString() {
		return "PriceDetail [Action=" + Action + ", Product=" + Product + ", DeleteaAllPriceRecords="
				+ DeleteaAllPriceRecords + ", PriceEventDetail=" + PriceEventDetail + "]";
	}
	
	
	
}
