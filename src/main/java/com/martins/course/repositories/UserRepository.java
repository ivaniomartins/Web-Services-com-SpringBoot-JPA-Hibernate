package com.martins.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martins.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {


	
	
}
