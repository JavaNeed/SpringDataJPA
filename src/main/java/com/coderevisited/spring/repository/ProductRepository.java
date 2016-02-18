package com.coderevisited.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderevisited.spring.jpa.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
