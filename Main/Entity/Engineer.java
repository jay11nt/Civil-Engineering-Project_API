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
