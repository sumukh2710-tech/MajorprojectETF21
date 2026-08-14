package com.example.placement_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/placement/drives")
public class PlacementDriveController {

    private final PlacementDriveRepository repository;

    public PlacementDriveController(PlacementDriveRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PlacementDrive> getAllDrives() {
        return repository.findAll();
    }

    @PostMapping
    public PlacementDrive addDrive(@RequestBody PlacementDrive drive) {
        return repository.save(drive);
    }
}