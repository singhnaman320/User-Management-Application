package com.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
