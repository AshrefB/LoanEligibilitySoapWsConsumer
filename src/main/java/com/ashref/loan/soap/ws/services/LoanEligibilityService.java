package com.ashref.loan.soap.ws.services;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.ashref.loan.soap.ws.loaneligibility.CustomerRequest;
import com.ashref.loan.soap.ws.loaneligibility.WsResponse;

@Service
public class LoanEligibilityService {
	@Autowired
	private Jaxb2Marshaller marshaller;
	private WebServiceTemplate template;
	private final String URL = "http://localhost:8081/ws";
	
	public WsResponse getLoanStatus(CustomerRequest request) {
		template = new WebServiceTemplate(marshaller);
		return (WsResponse) template.marshalSendAndReceive(URL, request);
	}
}
