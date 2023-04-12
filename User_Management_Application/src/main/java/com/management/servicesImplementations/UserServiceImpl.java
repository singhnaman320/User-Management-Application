package com.management.servicesImplementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entities.User;
import com.management.exceptions.UserNotFoundException;
import com.management.repositories.UserRepository;
import com.management.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		if(user != null) {
			
			User saveUser= userRepository.save(user);
			return saveUser;
		}
		else 
			
			throw new UserNotFoundException("Facing problem in creating new user");
	}

}
