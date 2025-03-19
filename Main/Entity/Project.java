
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
   private LocalDate startDate;
    private LocalDate endDate;

@ManyToOne
    @JoinColumn(name = "contractor_id")
    private Contractor contractor;

 @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Engineer> engineers;
