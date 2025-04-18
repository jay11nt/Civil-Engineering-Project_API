package com.example.civil.controller;

import com.example.civil.entity.Project;
import com.example.civil.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController 
{
    private final ProjectService projectService;
    public ProjectController(ProjectService projectService) 
    {
        this.projectService = projectService;
    }
@PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project) 
    {
        return ResponseEntity.ok(projectService.createProject(project));
    }
@GetMapping
    public ResponseEntity<List<Project>> getAllProjects() 
    {
        return ResponseEntity.ok(projectService.getAllProjects());
    }
@GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) 
    {
        return projectService.getProjectById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
@PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @RequestBody Project project) 
    {
        return ResponseEntity.ok(projectService.updateProject(id, project));
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) 
    {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}
