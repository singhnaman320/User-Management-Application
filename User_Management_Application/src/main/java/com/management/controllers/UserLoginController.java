package com.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/") /* provide security after /user/ */
public class UserLoginController {

	@GetMapping("/")
	public String home(){
		
		return "userLogin/home";
	}
}
