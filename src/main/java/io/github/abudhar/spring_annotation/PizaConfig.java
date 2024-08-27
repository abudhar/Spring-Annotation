package io.github.abudhar.spring_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.abudhar.spring_annotation.controller.PizzaControler;
import io.github.abudhar.spring_annotation.service.NVPizza;
import io.github.abudhar.spring_annotation.service.Piza;
import io.github.abudhar.spring_annotation.service.VPizza;

@Configuration
public class PizaConfig {
	
	
	@Bean
	public Piza getVegPizza() {
		return new VPizza();
	}
	@Bean
	public Piza getNonVegPizza() {
		return new NVPizza();
	}
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public PizzaControler getPizzaControler() {
		return new PizzaControler(getNonVegPizza());
	}
}
