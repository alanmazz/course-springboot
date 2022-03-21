package com.alanmazzolenis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanmazzolenis.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
