package io.github.abudhar.spring_annotation.controller;

import io.github.abudhar.spring_annotation.service.Piza;

public class PizzaControler {
	
	private Piza pizza;

	public PizzaControler(Piza pizza) {
		this.pizza = pizza;
	}
	
	public String getPiza() {
		return pizza.getPizza();
	}
	
	private void init() {
		System.out.println("init method Called");
	}
	private void destroy() {
		System.out.println("destroy method Called");
	}
}
