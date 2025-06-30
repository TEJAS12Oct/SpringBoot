package com.example.SpringBootJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootJPA.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
