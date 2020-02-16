package com.ashref.loan.soap.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashref.loan.soap.ws.loaneligibility.CustomerRequest;
import com.ashref.loan.soap.ws.loaneligibility.WsResponse;
import com.ashref.loan.soap.ws.services.LoanEligibilityService;

@RestController
public class TestSoap {
	@Autowired
	private LoanEligibilityService service;
	
	@PostMapping("/ws/loan/status")
	public WsResponse testConsume(@RequestBody CustomerRequest request) {
		return service.getLoanStatus(request);
	}
}
