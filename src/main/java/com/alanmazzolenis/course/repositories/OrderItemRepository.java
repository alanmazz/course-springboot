package com.alanmazzolenis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanmazzolenis.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
