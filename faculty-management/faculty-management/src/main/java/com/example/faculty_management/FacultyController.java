package com.example.faculty_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    private final FacultyRepository repository;

    public FacultyController(FacultyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Faculty> getAllFaculty() {
        return repository.findAll();
    }

    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        return repository.save(faculty);
    }
}