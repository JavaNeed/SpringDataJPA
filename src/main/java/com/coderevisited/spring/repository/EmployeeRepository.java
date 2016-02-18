package com.coderevisited.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderevisited.spring.jpa.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
