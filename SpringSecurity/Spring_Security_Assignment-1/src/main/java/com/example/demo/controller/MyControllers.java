package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControllers {
	
	
	@RequestMapping("/")
	public String homePage() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "logout.jsp";
	}

}
