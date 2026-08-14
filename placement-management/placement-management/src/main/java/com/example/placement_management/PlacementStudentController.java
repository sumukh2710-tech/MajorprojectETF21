package com.example.placement_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/placement/students")
public class PlacementStudentController {

    private final PlacementStudentRepository repository;

    public PlacementStudentController(PlacementStudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PlacementStudent> getAllStudents() {
        return repository.findAll();
    }

    @PostMapping
    public PlacementStudent addStudent(@RequestBody PlacementStudent student) {
        return repository.save(student);
    }
}