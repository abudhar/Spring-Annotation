package io.github.abudhar.spring_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import io.github.abudhar.spring_annotation.controller.PizzaControler;
import io.github.abudhar.spring_annotation.service.NVPizza;
import io.github.abudhar.spring_annotation.service.Piza;
import io.github.abudhar.spring_annotation.service.VPizza;

@Configuration
@Lazy
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
	@Lazy
	public PizzaControler getPizzaControler() {
		return new PizzaControler(getNonVegPizza());
	}
}
