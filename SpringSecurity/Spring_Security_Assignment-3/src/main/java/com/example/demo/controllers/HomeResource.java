package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource{
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome to home page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome to home page USER";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome to home page ADMIN";
	}
	

}
