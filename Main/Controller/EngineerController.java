package com.example.civil.controller;

import com.example.civil.entity.Engineer;
import com.example.civil.service.EngineerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/engineers")
public class EngineerController 
{
    private final EngineerService engineerService;

public EngineerController(EngineerService engineerService) {
        this.engineerService = engineerService;
    }
@PostMapping
    public ResponseEntity<Engineer> createEngineer(@RequestBody Engineer engineer) {
        return ResponseEntity.ok(engineerService.createEngineer(engineer));
    }
@GetMapping
    public ResponseEntity<List<Engineer>> getAllEngineers() {
        return ResponseEntity.ok(engineerService.getAllEngineers());
    }
@GetMapping("/{id}")
    public ResponseEntity<Engineer> getEngineerById(@PathVariable Long id) {
        return engineerService.getEngineerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
@PutMapping("/{id}")
    public ResponseEntity<Engineer> updateEngineer(@PathVariable Long id, @RequestBody Engineer engineer) {
        return ResponseEntity.ok(engineerService.updateEngineer(id, engineer));
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEngineer(@PathVariable Long id) {
        engineerService.deleteEngineer(id);
        return ResponseEntity.noContent().build();
    }
}
