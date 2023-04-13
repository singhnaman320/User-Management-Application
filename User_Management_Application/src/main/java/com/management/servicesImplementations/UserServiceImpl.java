package com.management.servicesImplementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.management.entities.User;
import com.management.exceptions.UserNotFoundException;
import com.management.repositories.UserRepository;
import com.management.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public User createUser(User user) throws UserNotFoundException {
		
		if(user != null) {
			
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setRole("ROLE_USER");
			
			User saveUser= userRepository.save(user);
			return saveUser;
		}
		else 
			
			throw new UserNotFoundException("Facing problem in creating new user");
	}

	@Override
	public boolean checkEmailPresence(String email) throws UserNotFoundException {
		
		return userRepository.existsByEmail(email);
		
	}

}
