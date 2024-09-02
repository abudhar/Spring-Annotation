package io.github.abudhar.spring_annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.abudhar.spring_annotation.bean.Book;

@Controller
@ResponseBody
public class MVCController {

	@RequestMapping(path = "/hello")
//	@ResponseBody
	public String hello() {
		return "hello world!!";
	}

	@RequestMapping(path = "/book")
//	@ResponseBody
	public Book book() {
		return new Book("1984", "George Orwell", "9780451524935");
	}
}
