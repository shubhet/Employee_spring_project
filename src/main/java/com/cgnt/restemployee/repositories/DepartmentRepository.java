package com.cgnt.restemployee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgnt.restemployee.models.Department;



public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
