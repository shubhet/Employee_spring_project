package com.cgnt.restemployee.models;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
	@Id
	@SequenceGenerator(name="empSeq",initialValue=8000,allocationSize=1,sequenceName="emp_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int empno;
	@Column
	private String empName;
	@Column(unique=true)
	private String email;
	@Column
	private String mobile;
	@Column(unique=true)
	private String username;
	@Column
	private String password;
	@Column
	private String status;
	@Column
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private String hiredate;
	@Column
	private double salary;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Department department;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Job job;
	
	
	
	

}
