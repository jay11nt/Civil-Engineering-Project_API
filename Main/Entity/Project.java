
package com.example.civil.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Project {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
