package com.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.entities.OrderItem;
import com.springboot.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}