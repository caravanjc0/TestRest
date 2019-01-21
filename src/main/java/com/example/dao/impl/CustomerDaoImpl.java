package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dao.CustomerDao;
import com.example.model.CustomerDetail;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<CustomerDetail> findAll() {
		List<CustomerDetail> result = new ArrayList<>();
		
		CustomerDetail detail1 = new CustomerDetail();
		detail1.setCustomerId("00021244");
		detail1.setOriginChannel("BANCA SERFIN");
		detail1.setFullName("ACEVES GONZALEZ ADOLFO");
		detail1.setCondition("CLIENTE");
		detail1.setSegment("PREMIER");
		detail1.setAddress("LOMA BONITA 1839");
		detail1.setCustomerCategory("FISICA");
		result.add(detail1);

		CustomerDetail detail2 = new CustomerDetail();
		detail2.setCustomerId("00021245");
		detail1.setOriginChannel("BANCA SERFIN");
		detail2.setFullName("GUTIERREZ HERNANDEZ LUIS");
		detail1.setCondition("CLIENTE");
		detail1.setSegment("PREMIER");
		detail2.setAddress("VASCO DE QUIROGA 222");
		detail1.setCustomerCategory("FISICA");
		result.add(detail2);
		
		CustomerDetail detail3 = new CustomerDetail();
		detail3.setCustomerId("00021246");
		detail1.setOriginChannel("BANCA SERFIN");
		detail3.setFullName("SANCHEZ RUIZ OSCAR");
		detail1.setCondition("CLIENTE");
		detail1.setSegment("PREMIER");
		detail3.setAddress("EDUARDO MOLINA 342");
		detail1.setCustomerCategory("FISICA");
		result.add(detail3);
		
		return result;
	}

}
