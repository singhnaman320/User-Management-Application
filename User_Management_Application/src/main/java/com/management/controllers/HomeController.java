package com.management.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@GetMapping("/signIn")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/info")
	public String info() {
		
		return "info";
	}
}
