package com.springboot10steps.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	
	@GetMapping("/books")
	
	public List<Book> getallbooks()
	{
		return Arrays.asList(new Book(1l, "Mastering", "Spring boot"));
	}
	
	
}