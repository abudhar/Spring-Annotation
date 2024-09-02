package io.github.abudhar.spring_annotation.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	public String sayHello() {
		return "Hello from Controller";
	}
}
