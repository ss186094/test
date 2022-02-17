package com.ncr.nis.ext.catalogue.models.product;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Ticketing {
	@JacksonXmlProperty
	private String Action;
	@JacksonXmlProperty
	private String MerchandiseHierarchyAssociationAction;
	@JacksonXmlProperty
	private boolean DisplayEnergyForCustomer;
	@JacksonXmlProperty
	private Object KiloJoulesPerPackSize;
	@JacksonXmlProperty
	private Object GramsForEnergyCalculation;
	@JacksonXmlProperty
	private String Status;
	@JacksonXmlProperty
	private boolean WeightedProduct;
	@JacksonXmlProperty
	private String ItemVendorRefillIndicator;
	@JacksonXmlProperty
	private String ItemMerchandiseIndicator;
	@JacksonXmlProperty
	private String ItemSellableIndicator;
	@JacksonXmlProperty
	private String SupplierBrandName;
	@JacksonXmlProperty
	private int ItemTypeCode;
	@JacksonXmlProperty
	private Object ScaleLabelType;
	@JacksonXmlProperty
	private int OrderItemId;
	@JacksonXmlProperty
	private Object ShelfLifeDays;
	@JacksonXmlProperty
	private String ItemName;
	@JacksonXmlProperty
	private String LabelLine1;
	@JacksonXmlProperty
	private String LabelLine2;
	@JacksonXmlProperty
	private String LabelSize;
	@JacksonXmlProperty
	private int ShelfFriendlyPackageIndicator;
	@JacksonXmlProperty
	private String SizeUnitOfMeasure;
	@JacksonXmlProperty
	private Object TareWeightUnitOfMeasure;
	@JacksonXmlProperty
	private boolean UnitPricingProcessing;
	@JacksonXmlProperty
	private Object UnitPricingQuantity;
	@JacksonXmlProperty
	private Object UnitPricingUnitOfMeasure;
	@JacksonXmlProperty
	private Object UnitPricingUnitOfMeasureQuantity;
	@JacksonXmlProperty
	private List<BarCode> Barcode;
	@JacksonXmlProperty
	private SalesRestriction SalesRestriction;
	@JacksonXmlProperty
	private int CategoryTax;
	@JacksonXmlProperty
	private Object CategoryWeighScaleCode;
	@JacksonXmlProperty
	private int FirstMarkdownPercent;
	@JacksonXmlProperty
	private int SecondMarkdownPercent;
	@JacksonXmlProperty
	private int ThirdMarkdownPercent;
	@JacksonXmlProperty
	private int MarkdownCycleDays;
	@JacksonXmlProperty
	private int MarkdownSellByDays;
	@JacksonXmlProperty
	private String MondayIndicator;
	@JacksonXmlProperty
	private String TuesdayIndicator;
	@JacksonXmlProperty
	private String WednesdayIndicator;
	@JacksonXmlProperty
	private String ThursdayIndicator;
	@JacksonXmlProperty
	private String FridayIndicator;
	@JacksonXmlProperty
	private String SaturdayIndicator;
	@JacksonXmlProperty
	private String SundayIndicator;
	@JacksonXmlProperty
	private String AnyDayIndicator;
	@JacksonXmlProperty
	private Date CodeCheckStartDate;
	@JacksonXmlProperty
	private int CodeCheckScheduleIncluded;
	
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getMerchandiseHierarchyAssociationAction() {
		return MerchandiseHierarchyAssociationAction;
	}
	public void setMerchandiseHierarchyAssociationAction(String merchandiseHierarchyAssociationAction) {
		MerchandiseHierarchyAssociationAction = merchandiseHierarchyAssociationAction;
	}
	public boolean isDisplayEnergyForCustomer() {
		return DisplayEnergyForCustomer;
	}
	public void setDisplayEnergyForCustomer(boolean displayEnergyForCustomer) {
		DisplayEnergyForCustomer = displayEnergyForCustomer;
	}
	public Object getKiloJoulesPerPackSize() {
		return KiloJoulesPerPackSize;
	}
	public void setKiloJoulesPerPackSize(Object kiloJoulesPerPackSize) {
		KiloJoulesPerPackSize = kiloJoulesPerPackSize;
	}
	public Object getGramsForEnergyCalculation() {
		return GramsForEnergyCalculation;
	}
	public void setGramsForEnergyCalculation(Object gramsForEnergyCalculation) {
		GramsForEnergyCalculation = gramsForEnergyCalculation;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public boolean isWeightedProduct() {
		return WeightedProduct;
	}
	public void setWeightedProduct(boolean weightedProduct) {
		WeightedProduct = weightedProduct;
	}
	public String getItemVendorRefillIndicator() {
		return ItemVendorRefillIndicator;
	}
	public void setItemVendorRefillIndicator(String itemVendorRefillIndicator) {
		ItemVendorRefillIndicator = itemVendorRefillIndicator;
	}
	public String getItemMerchandiseIndicator() {
		return ItemMerchandiseIndicator;
	}
	public void setItemMerchandiseIndicator(String itemMerchandiseIndicator) {
		ItemMerchandiseIndicator = itemMerchandiseIndicator;
	}
	public String getItemSellableIndicator() {
		return ItemSellableIndicator;
	}
	public void setItemSellableIndicator(String itemSellableIndicator) {
		ItemSellableIndicator = itemSellableIndicator;
	}
	public String getSupplierBrandName() {
		return SupplierBrandName;
	}
	public void setSupplierBrandName(String supplierBrandName) {
		SupplierBrandName = supplierBrandName;
	}
	public int getItemTypeCode() {
		return ItemTypeCode;
	}
	public void setItemTypeCode(int itemTypeCode) {
		ItemTypeCode = itemTypeCode;
	}
	public Object getScaleLabelType() {
		return ScaleLabelType;
	}
	public void setScaleLabelType(Object scaleLabelType) {
		ScaleLabelType = scaleLabelType;
	}
	public int getOrderItemId() {
		return OrderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		OrderItemId = orderItemId;
	}
	public Object getShelfLifeDays() {
		return ShelfLifeDays;
	}
	public void setShelfLifeDays(Object shelfLifeDays) {
		ShelfLifeDays = shelfLifeDays;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getLabelLine1() {
		return LabelLine1;
	}
	public void setLabelLine1(String labelLine1) {
		LabelLine1 = labelLine1;
	}
	public String getLabelLine2() {
		return LabelLine2;
	}
	public void setLabelLine2(String labelLine2) {
		LabelLine2 = labelLine2;
	}
	public String getLabelSize() {
		return LabelSize;
	}
	public void setLabelSize(String labelSize) {
		LabelSize = labelSize;
	}
	public int getShelfFriendlyPackageIndicator() {
		return ShelfFriendlyPackageIndicator;
	}
	public void setShelfFriendlyPackageIndicator(int shelfFriendlyPackageIndicator) {
		ShelfFriendlyPackageIndicator = shelfFriendlyPackageIndicator;
	}
	public String getSizeUnitOfMeasure() {
		return SizeUnitOfMeasure;
	}
	public void setSizeUnitOfMeasure(String sizeUnitOfMeasure) {
		SizeUnitOfMeasure = sizeUnitOfMeasure;
	}
	public Object getTareWeightUnitOfMeasure() {
		return TareWeightUnitOfMeasure;
	}
	public void setTareWeightUnitOfMeasure(Object tareWeightUnitOfMeasure) {
		TareWeightUnitOfMeasure = tareWeightUnitOfMeasure;
	}
	public boolean isUnitPricingProcessing() {
		return UnitPricingProcessing;
	}
	public void setUnitPricingProcessing(boolean unitPricingProcessing) {
		UnitPricingProcessing = unitPricingProcessing;
	}
	public Object getUnitPricingQuantity() {
		return UnitPricingQuantity;
	}
	public void setUnitPricingQuantity(Object unitPricingQuantity) {
		UnitPricingQuantity = unitPricingQuantity;
	}
	public Object getUnitPricingUnitOfMeasure() {
		return UnitPricingUnitOfMeasure;
	}
	public void setUnitPricingUnitOfMeasure(Object unitPricingUnitOfMeasure) {
		UnitPricingUnitOfMeasure = unitPricingUnitOfMeasure;
	}
	public Object getUnitPricingUnitOfMeasureQuantity() {
		return UnitPricingUnitOfMeasureQuantity;
	}
	public void setUnitPricingUnitOfMeasureQuantity(Object unitPricingUnitOfMeasureQuantity) {
		UnitPricingUnitOfMeasureQuantity = unitPricingUnitOfMeasureQuantity;
	}
	public List<BarCode> getBarcode() {
		return Barcode;
	}
	public void setBarcode(List<BarCode> barcode) {
		Barcode = barcode;
	}
	public SalesRestriction getSalesRestriction() {
		return SalesRestriction;
	}
	public void setSalesRestriction(SalesRestriction salesRestriction) {
		SalesRestriction = salesRestriction;
	}
	public int getCategoryTax() {
		return CategoryTax;
	}
	public void setCategoryTax(int categoryTax) {
		CategoryTax = categoryTax;
	}
	public Object getCategoryWeighScaleCode() {
		return CategoryWeighScaleCode;
	}
	public void setCategoryWeighScaleCode(Object categoryWeighScaleCode) {
		CategoryWeighScaleCode = categoryWeighScaleCode;
	}
	public int getFirstMarkdownPercent() {
		return FirstMarkdownPercent;
	}
	public void setFirstMarkdownPercent(int firstMarkdownPercent) {
		FirstMarkdownPercent = firstMarkdownPercent;
	}
	public int getSecondMarkdownPercent() {
		return SecondMarkdownPercent;
	}
	public void setSecondMarkdownPercent(int secondMarkdownPercent) {
		SecondMarkdownPercent = secondMarkdownPercent;
	}
	public int getThirdMarkdownPercent() {
		return ThirdMarkdownPercent;
	}
	public void setThirdMarkdownPercent(int thirdMarkdownPercent) {
		ThirdMarkdownPercent = thirdMarkdownPercent;
	}
	public int getMarkdownCycleDays() {
		return MarkdownCycleDays;
	}
	public void setMarkdownCycleDays(int markdownCycleDays) {
		MarkdownCycleDays = markdownCycleDays;
	}
	public int getMarkdownSellByDays() {
		return MarkdownSellByDays;
	}
	public void setMarkdownSellByDays(int markdownSellByDays) {
		MarkdownSellByDays = markdownSellByDays;
	}
	public String getMondayIndicator() {
		return MondayIndicator;
	}
	public void setMondayIndicator(String mondayIndicator) {
		MondayIndicator = mondayIndicator;
	}
	public String getTuesdayIndicator() {
		return TuesdayIndicator;
	}
	public void setTuesdayIndicator(String tuesdayIndicator) {
		TuesdayIndicator = tuesdayIndicator;
	}
	public String getWednesdayIndicator() {
		return WednesdayIndicator;
	}
	public void setWednesdayIndicator(String wednesdayIndicator) {
		WednesdayIndicator = wednesdayIndicator;
	}
	public String getThursdayIndicator() {
		return ThursdayIndicator;
	}
	public void setThursdayIndicator(String thursdayIndicator) {
		ThursdayIndicator = thursdayIndicator;
	}
	public String getFridayIndicator() {
		return FridayIndicator;
	}
	public void setFridayIndicator(String fridayIndicator) {
		FridayIndicator = fridayIndicator;
	}
	public String getSaturdayIndicator() {
		return SaturdayIndicator;
	}
	public void setSaturdayIndicator(String saturdayIndicator) {
		SaturdayIndicator = saturdayIndicator;
	}
	public String getSundayIndicator() {
		return SundayIndicator;
	}
	public void setSundayIndicator(String sundayIndicator) {
		SundayIndicator = sundayIndicator;
	}
	public String getAnyDayIndicator() {
		return AnyDayIndicator;
	}
	public void setAnyDayIndicator(String anyDayIndicator) {
		AnyDayIndicator = anyDayIndicator;
	}
	public Date getCodeCheckStartDate() {
		return CodeCheckStartDate;
	}
	public void setCodeCheckStartDate(Date codeCheckStartDate) {
		CodeCheckStartDate = codeCheckStartDate;
	}
	public int getCodeCheckScheduleIncluded() {
		return CodeCheckScheduleIncluded;
	}
	public void setCodeCheckScheduleIncluded(int codeCheckScheduleIncluded) {
		CodeCheckScheduleIncluded = codeCheckScheduleIncluded;
	}
	@Override
	public String toString() {
		return "Ticketing [Action=" + Action + ", MerchandiseHierarchyAssociationAction="
				+ MerchandiseHierarchyAssociationAction + ", DisplayEnergyForCustomer=" + DisplayEnergyForCustomer
				+ ", KiloJoulesPerPackSize=" + KiloJoulesPerPackSize + ", GramsForEnergyCalculation="
				+ GramsForEnergyCalculation + ", Status=" + Status + ", WeightedProduct=" + WeightedProduct
				+ ", ItemVendorRefillIndicator=" + ItemVendorRefillIndicator + ", ItemMerchandiseIndicator="
				+ ItemMerchandiseIndicator + ", ItemSellableIndicator=" + ItemSellableIndicator + ", SupplierBrandName="
				+ SupplierBrandName + ", ItemTypeCode=" + ItemTypeCode + ", ScaleLabelType=" + ScaleLabelType
				+ ", OrderItemId=" + OrderItemId + ", ShelfLifeDays=" + ShelfLifeDays + ", ItemName=" + ItemName
				+ ", LabelLine1=" + LabelLine1 + ", LabelLine2=" + LabelLine2 + ", LabelSize=" + LabelSize
				+ ", ShelfFriendlyPackageIndicator=" + ShelfFriendlyPackageIndicator + ", SizeUnitOfMeasure="
				+ SizeUnitOfMeasure + ", TareWeightUnitOfMeasure=" + TareWeightUnitOfMeasure
				+ ", UnitPricingProcessing=" + UnitPricingProcessing + ", UnitPricingQuantity=" + UnitPricingQuantity
				+ ", UnitPricingUnitOfMeasure=" + UnitPricingUnitOfMeasure + ", UnitPricingUnitOfMeasureQuantity="
				+ UnitPricingUnitOfMeasureQuantity + ", Barcode=" + Barcode + ", SalesRestriction=" + SalesRestriction
				+ ", CategoryTax=" + CategoryTax + ", CategoryWeighScaleCode=" + CategoryWeighScaleCode
				+ ", FirstMarkdownPercent=" + FirstMarkdownPercent + ", SecondMarkdownPercent=" + SecondMarkdownPercent
				+ ", ThirdMarkdownPercent=" + ThirdMarkdownPercent + ", MarkdownCycleDays=" + MarkdownCycleDays
				+ ", MarkdownSellByDays=" + MarkdownSellByDays + ", MondayIndicator=" + MondayIndicator
				+ ", TuesdayIndicator=" + TuesdayIndicator + ", WednesdayIndicator=" + WednesdayIndicator
				+ ", ThursdayIndicator=" + ThursdayIndicator + ", FridayIndicator=" + FridayIndicator
				+ ", SaturdayIndicator=" + SaturdayIndicator + ", SundayIndicator=" + SundayIndicator
				+ ", AnyDayIndicator=" + AnyDayIndicator + ", CodeCheckStartDate=" + CodeCheckStartDate
				+ ", CodeCheckScheduleIncluded=" + CodeCheckScheduleIncluded + "]";
	}
	
	
	
	
	
	
	
	
}





























