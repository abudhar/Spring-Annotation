package io.github.abudhar.spring_annotation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.abudhar.spring_annotation.bean.Book;

@RestController
@RequestMapping("/rest")
public class RestControlller {
	@RequestMapping(path = "/hello")
	public String hello() {
		return "hello world!!";
	}

	@RequestMapping(path = "/book")
	public Book  book() {
		return new Book("1984", "George Orwell", "9780451524935");
	}
}
