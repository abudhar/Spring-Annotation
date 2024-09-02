package io.github.abudhar.spring_annotation.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public String sayHello() {
		return "hello from Service";
	}
}
