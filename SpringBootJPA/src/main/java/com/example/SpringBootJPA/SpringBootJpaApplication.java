package com.example.SpringBootJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootJPA.Model.User;
import com.example.SpringBootJPA.Repository.UserRepository;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Autowired
	UserRepository UserRepository;

	@Override
	public void run(String... args) throws Exception {
		// Inserting the data in the MySQL table.
		User first = new User("Tejas");
		// Save the record before deleting it
		UserRepository.save(first);
		System.out.println("Record inserted successfully.");

		// Deleting the record with id 1
		if (UserRepository.existsById(2)) {
			// Check if the record exists
			UserRepository.deleteById(2);
			System.out.println("Record deleted successfully.");
		} else {
			System.out.println("Record not found.");
		} 
	}
}


// 