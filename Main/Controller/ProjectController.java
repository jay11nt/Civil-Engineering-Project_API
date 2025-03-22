package com.example.civil.controller;

import com.example.civil.entity.Project;
import com.example.civil.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;
public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
@PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.createProject(project));
    }
