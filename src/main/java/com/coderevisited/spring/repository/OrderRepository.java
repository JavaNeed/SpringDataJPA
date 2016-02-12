package com.coderevisited.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderevisited.spring.jpa.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
