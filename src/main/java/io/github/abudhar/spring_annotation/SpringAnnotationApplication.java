package io.github.abudhar.spring_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.abudhar.spring_annotation.controller.MyController;
import io.github.abudhar.spring_annotation.controller.PizzaControler;
import io.github.abudhar.spring_annotation.controller.PizzaController;
import io.github.abudhar.spring_annotation.lazy.LazyLoader;
import io.github.abudhar.spring_annotation.repository.MyRepository;
import io.github.abudhar.spring_annotation.service.MyService;
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
//		PizzaControler beaan = (PizzaControler) context.getBean("getPizzaControler");
//		System.out.println(beaan.getPiza());
		
//		MyController controller = context.getBean(MyController.class);
//		System.out.println("----"+controller.sayHello());
//		MyService service = context.getBean(MyService.class);
//		System.out.println("----"+service.sayHello());
//		MyRepository repo = context.getBean(MyRepository.class);
//		System.out.println("----"+service.sayHello());
		
//		LazyLoader lazy = context.getBean(LazyLoader.class);//on demand
		
		ConfigApp prop = context.getBean(ConfigApp.class);
		prop.display();
		ConfigPropAnno properties = context.getBean(ConfigPropAnno.class);
		System.out.println("----"+properties.getName());
		System.out.println("----"+properties.getDesc());
		System.out.println("----"+properties.getUploadDir());
		System.out.println("----"+properties.getSecurity().getUser());
		System.out.println("----"+properties.getSecurity().getPassword());
		System.out.println("----"+properties.getSecurity().getPermission());
		System.out.println("----"+properties.getSecurity().getRoles());
		
		
	}

}
