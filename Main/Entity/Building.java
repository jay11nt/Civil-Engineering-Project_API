package com.example.civil.entity;

import javax.persistence.*;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

// Constructors
    public Building() { }

 public Building(String name, String address, Project project) {
        this.name = name;
        this.address = address;
        this.project = project;
    }
// Getters and Setters
    public Long getId() {
        return id;
    }
public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
