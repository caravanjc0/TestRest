package com.example.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.dto.FindCustomersInDto;
import com.example.model.CustomerDetail;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerDao customerDao;
	
	@Override
	public List<CustomerDetail> findCustomers(FindCustomersInDto inDto) {
		List<CustomerDetail> result = null;
			
		List<CustomerDetail> customers = customerDao.findAll();
		
		if (inDto.getCustomerId() != null) {
			result = filterCustomerById(customers, inDto.getCustomerId());
		}
		
		return result;
	}

	private List<CustomerDetail> filterCustomerById(List<CustomerDetail> customers, String customerId) {
		List<CustomerDetail> filteredList = customers.stream().filter(x -> x.getCustomerId().equals(customerId)).collect(Collectors.toList());
			
		return filteredList;
	}

}
