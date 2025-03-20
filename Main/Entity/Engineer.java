package com.example.civil.entity;

import javax.persistence.*;

@Entity
public class Engineer 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    
// Constructors
    public Engineer() { }
    
    public Engineer(String name, String specialization, Project project) {
        this.name = name;
        this.specialization = specialization;
        this.project = project;
    }
