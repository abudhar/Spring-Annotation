package io.github.abudhar.spring_annotation.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza {
	
	@Override
	public String getPizza() {
		return "---------veg Pizza---------------";
	}
}
