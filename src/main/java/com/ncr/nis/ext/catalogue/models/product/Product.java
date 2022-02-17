package com.ncr.nis.ext.catalogue.models.product;



import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Product {
	
	@JacksonXmlProperty
	private Long TransactionID;
	
	@JacksonXmlProperty
	private String Action;
	
	@JacksonXmlProperty
	private String ProductID;
	
	@JacksonXmlProperty
	private String shortDescription;
	
	@JacksonXmlProperty
	private Long sizeQuantity;
	
	@JacksonXmlProperty
	private String SizeUnitOfMeasure;
	
	@JacksonXmlProperty
	private String TaxRate;
	
	@JacksonXmlProperty
	private String TareWeight;
	
	@JacksonXmlProperty
	private String TareWeightUnitOfMeasure;
	
	@JacksonXmlProperty
	private List<BarCode> BarCode;
	
	@JacksonXmlProperty
	private MerchandiseHierarchyAssociation MerchandiseHierarchyAssociation;
	
	@JacksonXmlProperty
	private POSSearchMenu POSSearchMenu;
	
	@JacksonXmlProperty
	private SalesRestriction SalesRestriction;
	
	@JacksonXmlProperty
	private AdditionalData AdditionalData;
	
	

	public Long getTransactionID() {
		return TransactionID;
	}



	public void setTransactionID(Long transactionID) {
		TransactionID = transactionID;
	}



	public String getAction() {
		return Action;
	}



	public void setAction(String action) {
		Action = action;
	}



	public String getProductID() {
		return ProductID;
	}



	public void setProductID(String productID) {
		ProductID = productID;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public Long getSizeQuantity() {
		return sizeQuantity;
	}



	public void setSizeQuantity(Long sizeQuantity) {
		this.sizeQuantity = sizeQuantity;
	}



	public String getSizeUnitOfMeasure() {
		return SizeUnitOfMeasure;
	}



	public void setSizeUnitOfMeasure(String sizeUnitOfMeasure) {
		SizeUnitOfMeasure = sizeUnitOfMeasure;
	}



	public String getTaxRate() {
		return TaxRate;
	}



	public void setTaxRate(String taxRate) {
		TaxRate = taxRate;
	}



	public String getTareWeight() {
		return TareWeight;
	}



	public void setTareWeight(String tareWeight) {
		TareWeight = tareWeight;
	}



	public String getTareWeightUnitOfMeasure() {
		return TareWeightUnitOfMeasure;
	}



	public void setTareWeightUnitOfMeasure(String tareWeightUnitOfMeasure) {
		TareWeightUnitOfMeasure = tareWeightUnitOfMeasure;
	}



	



	public List<BarCode> getBarCode() {
		return BarCode;
	}



	public void setBarCode(List<BarCode> barCode) {
		BarCode = barCode;
	}



	public MerchandiseHierarchyAssociation getMerchandiseHierarchyAssociation() {
		return MerchandiseHierarchyAssociation;
	}



	public void setMerchandiseHierarchyAssociation(MerchandiseHierarchyAssociation merchandiseHierarchyAssociation) {
		MerchandiseHierarchyAssociation = merchandiseHierarchyAssociation;
	}



	public POSSearchMenu getPOSSearchMenu() {
		return POSSearchMenu;
	}



	public void setPOSSearchMenu(POSSearchMenu pOSSearchMenu) {
		POSSearchMenu = pOSSearchMenu;
	}



	public SalesRestriction getSalesRestriction() {
		return SalesRestriction;
	}



	public void setSalesRestriction(SalesRestriction salesRestriction) {
		SalesRestriction = salesRestriction;
	}



	public AdditionalData getAdditionalData() {
		return AdditionalData;
	}



	public void setAdditionalData(AdditionalData additionalData) {
		AdditionalData = additionalData;
	}



	@Override
	public String toString() {
		return "Product [TransactionID=" + TransactionID + ", Action=" + Action + ", ProductID=" + ProductID
				+ ", shortDescription=" + shortDescription + ", sizeQuantity=" + sizeQuantity + ", SizeUnitOfMeasure="
				+ SizeUnitOfMeasure + ", TaxRate=" + TaxRate + ", BarCode=" + BarCode
				+ ", MerchandiseHierarchyAssociation=" + MerchandiseHierarchyAssociation + ", POSSearchMenu="
				+ POSSearchMenu + ", SalesRestriction=" + SalesRestriction + ", AdditionalData=" + AdditionalData + "]";
	}
	
	
	
	
	

}
