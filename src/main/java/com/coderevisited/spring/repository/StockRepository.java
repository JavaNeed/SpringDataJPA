package com.coderevisited.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderevisited.spring.jpa.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{

}
