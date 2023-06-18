package com.example.springbootsample1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	// http://localhost:8080/で接続
	public String index() {
		return "トップページ";
	}
	
	@GetMapping("/hello")
	// http://localhost:8080/helloで接続
	public String hello() {
		return "Hello Spring Boot!!";
	}
	
}
