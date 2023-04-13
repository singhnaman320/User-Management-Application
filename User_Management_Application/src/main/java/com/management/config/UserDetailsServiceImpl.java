package com.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.management.entities.User;
import com.management.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{  // UserDetailsService interface is part of spring security

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User thisUser = userRepository.findByEmail(email);
		
		if(thisUser != null) {
			
			return new CustomUserDetails(thisUser);
		}
		throw new UsernameNotFoundException("User does'nt exist with given email");
	} 

}
