package com.alanmazzolenis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanmazzolenis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
