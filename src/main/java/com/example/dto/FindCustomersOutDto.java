package com.example.dto;

import java.util.List;

import com.example.model.CustomerDetail;

public class FindCustomersOutDto {
	
	private List<CustomerDetail> customersData;

	public List<CustomerDetail> getCustomersData() {
		return customersData;
	}

	public void setCustomersData(List<CustomerDetail> customersData) {
		this.customersData = customersData;
	}

}
