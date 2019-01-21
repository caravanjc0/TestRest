package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FindCustomersInDto;
import com.example.dto.FindCustomersOutDto;
import com.example.model.CustomerDetail;
import com.example.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public ResponseEntity<FindCustomersOutDto> findCustomers(
			@RequestParam(name="customer_id", required=false) String customerId,
			@RequestParam(name="document_number", required=false) String documentNumber,
			@RequestParam(name="company_name", required=false) String companyName,
			@RequestParam(name="name", required=false) String name,
			@RequestParam(name="paternal_name", required=false) String paternalName,
			@RequestParam(name="maternal_name", required=false) String maternalName,
			@RequestHeader(name="content-type", required=true) String contentType,
			@RequestHeader(name="x-ibm-client-id", required=true) String xIbmClientId,
			@RequestHeader(name="authorization", required=true) String authorization,
			@RequestHeader(name="x-santander-global-id", required=true) String xSantanderGlobalId) {

		FindCustomersInDto inDto = new FindCustomersInDto(customerId, documentNumber, companyName, name, paternalName, maternalName);
		ResponseEntity<FindCustomersOutDto> response = null;
		List<CustomerDetail> customersData = customerService.findCustomers(inDto);
		
		try {
			if (customersData != null && !customersData.isEmpty()) {
				FindCustomersOutDto outDto = new FindCustomersOutDto();
				outDto.setCustomersData(customersData);
				response = new ResponseEntity<FindCustomersOutDto>(outDto, HttpStatus.OK);
			}
			else {
				response = new ResponseEntity<FindCustomersOutDto>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception e) {
			response = new ResponseEntity<FindCustomersOutDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		return response;
	}

}
