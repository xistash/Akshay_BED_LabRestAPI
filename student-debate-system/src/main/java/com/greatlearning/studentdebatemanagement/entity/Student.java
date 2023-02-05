package com.greatlearning.studentdebatemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String course;
	private String country;
	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}
	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		
	}
	public void setCourse(String course2) {
		// TODO Auto-generated method stub
		
	}
	public void setCountry(String country2) {
		// TODO Auto-generated method stub
		
	}

}
