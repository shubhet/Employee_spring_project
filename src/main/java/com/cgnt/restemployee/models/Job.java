package com.cgnt.restemployee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Job {
	@Id
	@SequenceGenerator(name="job_seq",initialValue=6000,allocationSize=1,sequenceName="JOB_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int jcode;
	@Column
	private String jname;

}
