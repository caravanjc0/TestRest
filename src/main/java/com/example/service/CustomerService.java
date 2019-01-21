package com.example.service;

import java.util.List;

import com.example.dto.FindCustomersInDto;
import com.example.model.CustomerDetail;

public interface CustomerService {

	List<CustomerDetail> findCustomers(FindCustomersInDto inDto);

}
