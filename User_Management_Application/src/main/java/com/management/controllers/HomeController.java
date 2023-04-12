package com.management.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.management.entities.User;
import com.management.exceptions.UserNotFoundException;
import com.management.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
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
	
	/*
	@ModelAttribute is used for binding data from request param (in key value pairs), but @RequestBody is used for binding data
	from whole body of the request like POST,PUT.. request types which contains other format like json, xml.@RequestParam is best 
	for reading a small number of params. @ModelAttribute is used when you have a form with a large number of fields.
	*/
	
	/* name="" must be same as used in register */
	
	@PostMapping("/createUser")
	public String saveUserHandler(@ModelAttribute User user, HttpSession session) throws UserNotFoundException {
		
		// HttpSession session is part of servlet used to show something on frontend for some time
		//System.out.println(user);
		
		boolean result = userService.checkEmailPresence(user.getEmail());
		
		if(result) {
			
			session.setAttribute("message", "User already exist with given email Id");
			
			
			//System.out.println("User already exist with given email");
			
		}else {
			
			User saveThisUser = userService.createUser(user);
			
			if(saveThisUser != null) {
				
				session.setAttribute("message", "User details saved successfully");
				
			}else {
				
				session.setAttribute("message", "Server timeout..! Unable to save user in database");
			}
		}
		
		/*
 		use redirect here. otherwise same data will be inserted as we refresh base page on browser
		 */
		return "register";
	}
}
