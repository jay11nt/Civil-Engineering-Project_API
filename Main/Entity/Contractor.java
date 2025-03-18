package com.example.civil.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contractor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String licenseNumber;

@OneToMany(mappedBy = "contractor", cascade = CascadeType.ALL)
    private List<Project> projects;

// Constructors
        public Contractor() { }
        public Contractor(String name, String licenseNumber) 
    {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
// Getters and Setters
    public Long getId() {
        return id;
    }
public String getName() {
        return name;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
public List<Project> getProjects() {
        return projects;
    }
 public void setId(Long id) {
        this.id = id;
    }
