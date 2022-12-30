package com.cgnt.restemployee.models;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
	@SequenceGenerator(name="deptSeq",initialValue=5000,allocationSize=1,sequenceName="dept_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int deptno;
	@Column
	private String deptname;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Location location;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Employee> employees;

}
