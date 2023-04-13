package com.management.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entities.User;
import com.management.repositories.UserRepository;

@Controller
@RequestMapping("/user/") /* provide security after /user/ */
public class UserAfterLoginController {

	@Autowired
	private UserRepository userRepository;
	
	@ModelAttribute  /* For UI */
	private void userDetails(Model model, Principal principal) {
		
		String email = principal.getName();
		User user = userRepository.findByEmail(email);
		
		model.addAttribute("user", user);
	}
	
	@GetMapping("/")
	public String home(){
		
		return "userLogin/home";
	}
}
