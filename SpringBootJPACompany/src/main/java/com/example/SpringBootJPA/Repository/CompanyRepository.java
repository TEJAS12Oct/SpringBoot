package com.example.SpringBootJPA.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootJPA.Model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}