package com.example.demo.Helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
	// using get method and hello-world URI
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
}