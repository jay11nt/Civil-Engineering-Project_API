package com.example.civil.entity;

import javax.persistence.*;

@Entity
public class Engineer 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
