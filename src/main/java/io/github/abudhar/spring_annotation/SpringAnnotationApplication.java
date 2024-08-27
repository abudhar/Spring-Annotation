package io.github.abudhar.spring_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.abudhar.spring_annotation.controller.PizzaControler;
import io.github.abudhar.spring_annotation.controller.PizzaController;
import io.github.abudhar.spring_annotation.service.Pizza;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationApplication.class, args);
		PizzaController bean = context.getBean(PizzaController.class);
//		PizzaController bean = (PizzaController) context.getBean("pizza");
//		PizzaController bean = (PizzaController) context.getBean("pizzaController");
//		System.out.println(bean.getVegPizza());
		
//		AutoWired
//		System.out.println(bean.getVegPizza());
//		PizzaController pizza = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizza.getPizza());
		
//		Bean and COnfiguration
		PizzaControler beaan = (PizzaControler) context.getBean("getPizzaControler");
		System.out.println(beaan.getPiza());
		
	}

}
