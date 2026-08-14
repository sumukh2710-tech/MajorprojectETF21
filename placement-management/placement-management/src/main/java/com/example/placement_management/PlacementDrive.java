package com.example.placement_management;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement_drives")
public class PlacementDrive {

    @Id
    private int id;

    private String companyName;
    private String driveDate;
    private String jobRole;
    private double eligibilityCGPA;
    private String location;

    public PlacementDrive() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDriveDate() {
        return driveDate;
    }

    public void setDriveDate(String driveDate) {
        this.driveDate = driveDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public double getEligibilityCGPA() {
        return eligibilityCGPA;
    }

    public void setEligibilityCGPA(double eligibilityCGPA) {
        this.eligibilityCGPA = eligibilityCGPA;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}