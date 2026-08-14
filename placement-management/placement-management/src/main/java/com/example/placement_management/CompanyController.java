package com.example.placement_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/placement/companies")
public class CompanyController {

    private final CompanyRepository repository;

    public CompanyController(CompanyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return repository.findAll();
    }

    @PostMapping
    public Company addCompany(@RequestBody Company company) {
        return repository.save(company);
    }
}