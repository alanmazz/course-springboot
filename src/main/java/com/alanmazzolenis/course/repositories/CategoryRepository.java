package com.alanmazzolenis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanmazzolenis.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
