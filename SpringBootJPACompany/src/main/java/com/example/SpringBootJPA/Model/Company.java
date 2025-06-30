package com.example.SpringBootJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private int duration;
	private String profile;
	private int stipend;
	private boolean workFromHome;

	// Default constructor (required by JPA)
	public Company() {
	}

	// Parameterized constructor
	public Company(String name, int duration, String profile, int stipend, boolean workFromHome) {
		this.name = name;
		this.duration = duration;
		this.profile = profile;
		this.stipend = stipend;
		this.workFromHome = workFromHome;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int stipend) {
		this.stipend = stipend;
	}

	public boolean isWorkFromHome() {
		return workFromHome;
	}

	public void setWorkFromHome(boolean workFromHome) {
		this.workFromHome = workFromHome;
	}
}