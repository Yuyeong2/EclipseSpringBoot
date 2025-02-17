package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/web")
	public String hello() {
		System.out.println("hello");
		return "hello world";  
		}
}
