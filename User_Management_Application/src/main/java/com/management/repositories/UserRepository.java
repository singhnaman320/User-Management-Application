package com.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
