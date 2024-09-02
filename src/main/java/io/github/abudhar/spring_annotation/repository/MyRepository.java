package io.github.abudhar.spring_annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	public String sayHello() {
		return "hello from Repo";
	}
}
