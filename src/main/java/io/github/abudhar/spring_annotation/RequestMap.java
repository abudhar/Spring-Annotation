package io.github.abudhar.spring_annotation;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.abudhar.spring_annotation.bean.Book;

@RequestMapping("/api")
@RestController
public class RequestMap {
//	@RequestMapping(path = {"/book", "/books", "/getBooks.do"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	@GetMapping(value  = { "/book", "/books", "/getBooks.do" })
	public Book getBook() {
		return new Book("Design Patterns", "gang of four", "35434654");

	}

	@RequestMapping(path = { "/post/book" }, method = RequestMethod.POST)
	public Book getBookPost(@RequestBody Book book) {
		return new Book("Design Patterns", "gang of four", "35434654");

	}
	
	@PostMapping(path = { "/post/books" })
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book getBookPostman(@RequestBody Book book) {
		return book;
		
	}
	
	@PostMapping(path = { "/post/booksss" })
	public ResponseEntity<Book> getBookPostmans(@RequestBody Book book) {
		return new ResponseEntity<Book>(book, HttpStatus.BAD_GATEWAY);
	}
	
	@PutMapping(path = { "/books/update/{id}" })
	public ResponseEntity<Book> putBook(@PathVariable String id, @RequestBody Book book) {
		book.setIsbn(id);
		return ResponseEntity.ok(book);
	}
	@DeleteMapping(path = { "/books/delete/{id}" })
	public ResponseEntity<String> deleteBook(@PathVariable String id, @RequestBody Book book) {
		book.setIsbn(id);
		return ResponseEntity.ok("Deleted Successfully!!");
	}
}
