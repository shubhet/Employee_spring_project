package com.cgnt.restemployee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgnt.restemployee.models.Employee;



public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
