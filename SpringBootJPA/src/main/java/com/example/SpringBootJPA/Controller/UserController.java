package com.example.SpringBootJPA.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJPA.Model.User;
import com.example.SpringBootJPA.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userService.findUserById(id);
	}
	
	
	
	
}
