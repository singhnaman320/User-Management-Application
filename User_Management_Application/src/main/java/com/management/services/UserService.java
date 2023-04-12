package com.management.services;

import com.management.entities.User;
import com.management.exceptions.UserNotFoundException;

public interface UserService {

	public User createUser(User user)throws UserNotFoundException;
	
	public boolean checkEmailPresence(String email)throws UserNotFoundException;
}
