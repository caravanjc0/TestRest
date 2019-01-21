package com.example.dao;

import java.util.List;

import com.example.model.CustomerDetail;

public interface CustomerDao {

	List<CustomerDetail> findAll();

}
