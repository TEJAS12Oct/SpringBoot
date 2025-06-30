package com.example.SpringBootJPA.Model;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Constructors
	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	// Getters and Setters
	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}
}
