package com.coderevisited.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderevisited.spring.jpa.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
