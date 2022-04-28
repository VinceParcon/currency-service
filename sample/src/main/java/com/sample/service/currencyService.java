package com.sample.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.model.Currency;

@Service
public class currencyService {
	
	Logger logger = LoggerFactory.getLogger(currencyService.class);
	
	public ArrayList<Currency> findAllCurrency() {
		ArrayList<Currency> Currencies = new ArrayList<Currency>();
		Currencies.add(new Currency("USD", "1.0559"));
		Currencies.add(new Currency("EUR", "1"));
		Currencies.add(new Currency("PHP", "55.040921"));
		return Currencies;
	}

}
