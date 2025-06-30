package com.example.SpringBootJPA.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJPA.Model.Company;
import com.example.SpringBootJPA.Repository.CompanyRepository;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyRepository companyRepository;

	// Home Page
	@GetMapping("/")
	public String welcome() {
		return "<html><body><h1>WELCOME</h1></body></html>";
	}

	// Get All Companies
	@GetMapping
	public List<Company> getAllCompanies() {
		//return companyRepository.findAll();
		List<Company> companies = new ArrayList<>();
	    companyRepository.findAll().forEach(companies::add);
	    return companies;
	}

	// Get a Company by ID
	@GetMapping("/{id}")
	public Company getCompanyById(@PathVariable int id) {
		return companyRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
	}

	// Create a Company
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Company createCompany(@RequestBody Company company) {
		return companyRepository.save(company);
	}

	// Update a Company
	@PutMapping("/{id}")
	public Company updateCompany(@PathVariable int id, @RequestBody Company companyDetails) {
		Company company = companyRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
		company.setName(companyDetails.getName());
		company.setDuration(companyDetails.getDuration());
		company.setProfile(companyDetails.getProfile());
		company.setStipend(companyDetails.getStipend());
		company.setWorkFromHome(companyDetails.isWorkFromHome());
		return companyRepository.save(company);
	}

	// Delete a Company
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCompany(@PathVariable int id) {
		companyRepository.deleteById(id);
		return ResponseEntity.ok("Product deleted successfully");

	}
}