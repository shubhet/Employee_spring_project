package com.cgnt.restemployee.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




//@Setter
//@Getter


@Entity
@Table
public class Location {
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int lcode, String lname) {
		super();
		this.lcode = lcode;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Location [lcode=" + lcode + ", lname=" + lname + "]";
	}
	@Id
	@SequenceGenerator(name="locSeq",initialValue=5000,allocationSize=1,sequenceName="Loc_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int lcode;
	@Column
	private String lname;
	public int getLcode() {
		return lcode;
	}
	public void setLcode(int lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
