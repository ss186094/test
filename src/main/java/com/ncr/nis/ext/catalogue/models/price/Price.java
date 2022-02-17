package com.ncr.nis.ext.catalogue.models.price;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Price {

	
	@JacksonXmlProperty
	private String FileSequenceID;
	
	@JacksonXmlProperty
	private String Location;
	
	@JacksonXmlProperty
	private String OrganisationLevel;
	
	@JacksonXmlProperty
	private String CreateTimeStamp;
	
	@JacksonXmlProperty
	private List<PriceDetail> PriceDetail;

	public String getFileSequenceID() {
		return FileSequenceID;
	}

	public void setFileSequenceID(String fileSequenceID) {
		FileSequenceID = fileSequenceID;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getOrganisationLevel() {
		return OrganisationLevel;
	}

	public void setOrganisationLevel(String organisationLevel) {
		OrganisationLevel = organisationLevel;
	}

	public String getCreateTimeStamp() {
		return CreateTimeStamp;
	}

	public void setCreateTimeStamp(String createTimeStamp) {
		CreateTimeStamp = createTimeStamp;
	}

	

	public List<PriceDetail> getPriceDetail() {
		return PriceDetail;
	}

	public void setPriceDetail(List<PriceDetail> priceDetail) {
		PriceDetail = priceDetail;
	}

	@Override
	public String toString() {
		return "Price [FileSequenceID=" + FileSequenceID + ", Location=" + Location + ", OrganisationLevel="
				+ OrganisationLevel + ", CreateTimeStamp=" + CreateTimeStamp + ", PriceDetail=" + PriceDetail + "]";
	}
	
	
	
}
