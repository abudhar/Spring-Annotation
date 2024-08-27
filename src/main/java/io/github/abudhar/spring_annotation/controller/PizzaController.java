package io.github.abudhar.spring_annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.github.abudhar.spring_annotation.service.Pizza;
import io.github.abudhar.spring_annotation.service.VegPizza;

/**
 * 
 * @author Mohammed.abudhar
 * @apiNote : <i>There is No Need to Create the Object of this Class Spring IOC
 *          Container</i>
 */
@Component
//@Component("pizza")
public class PizzaController {
	
   private VegPizza vegPizza;

//	@Autowired
//	private VegPizza vegPizza;
	/*
	 * we Can use contructor without autowired
	 */
	public PizzaController(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}

	/*
	 * we Cannot use methods without autowired
	 */
//	@Autowired
//	public void setVegPizza(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}

//	public String getPizza() {
//		return "pizza Delivered";
//	}
	
	public String getVegPizza() {
		return vegPizza.getPizza();
	}
	
//	@Qualifier("vegPizza")
//	@Autowired
	private Pizza pizza;
	
	/*
	 * we Can use contructor without autowired
	 */
//	public PizzaController(Pizza pizza) {
//		this.pizza = pizza;
//	}
//	public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
//		this.pizza = pizza;
//	}
	
//	public String getPizza() {
//		return pizza.getPizza();
//	}

}
