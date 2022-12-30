package com.cgnt.restemployee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgnt.restemployee.models.Job;



public interface JobRepository  extends JpaRepository<Job,Integer>{

}
