package com.macrosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.macrosoft.model.FactureClient;
import com.macrosoft.repository.FactureClientRepository;

@RestController
public class FactureRestController {
	
	@Autowired
	private FactureClientRepository factureClientRepository;
	


	
	@RequestMapping(path="/facture", method=RequestMethod.GET)
	public List<FactureClient> getAllFactures(){
		List<FactureClient> allFactureClient = factureClientRepository.findAll();
		System.out.println("---- Display facture SIZE: " + allFactureClient.size());
		return  allFactureClient;
	}

}
