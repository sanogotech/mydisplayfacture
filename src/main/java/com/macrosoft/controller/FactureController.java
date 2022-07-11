package com.macrosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FactureController {
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		return "factures";
	}

	
	@RequestMapping(path="/facturehome", method=RequestMethod.GET)
	public String goHomeFacture(){
		return "factures";
	}
	

	


}
