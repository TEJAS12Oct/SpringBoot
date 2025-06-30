package com.example.SpringBootJPA.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootJPA.Model.User;
import com.example.SpringBootJPA.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}

	
}