package com.example.SpringBootJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	private String Name;

	public StudentInformation(int rollNo, String name) {
		this.rollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
