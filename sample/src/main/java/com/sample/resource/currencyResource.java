package com.sample.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Currency;
import com.sample.service.currencyService;

@RestController
@CrossOrigin
@RequestMapping("/currencyResource")
public class currencyResource {
	
	@Autowired
	private currencyService service;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ArrayList<Currency> findAllCurrency() {
		return service.findAllCurrency();
	}

}
