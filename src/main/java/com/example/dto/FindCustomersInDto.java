package com.example.dto;

public class FindCustomersInDto {
	
	private String customerId;
	private String documentNumber;
	private String companyName;
	private String name;
	private String paternalName;
	private String maternalName;
	
	public FindCustomersInDto(String customerId, String documentNumber, String companyName, String name,
			String paternalName, String maternalName) {
		this.customerId = customerId;
		this.documentNumber = documentNumber;
		this.companyName = companyName;
		this.name = name;
		this.paternalName = paternalName;
		this.maternalName = maternalName;
	}

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPaternalName() {
		return paternalName;
	}
	
	public void setPaternalName(String paternalName) {
		this.paternalName = paternalName;
	}
	
	public String getMaternalName() {
		return maternalName;
	}
	
	public void setMaternalName(String maternalName) {
		this.maternalName = maternalName;
	}

}
