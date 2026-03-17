package com.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
