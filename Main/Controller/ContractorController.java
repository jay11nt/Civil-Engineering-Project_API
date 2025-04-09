package com.example.civil.controller;

import com.example.civil.entity.Contractor;
import com.example.civil.service.ContractorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/contractors")
public class ContractorController 
{
    private final ContractorService contractorService;

    public ContractorController(ContractorService contractorService) 
    {
        this.contractorService = contractorService;
    }
  
@PostMapping
    public ResponseEntity<Contractor> createContractor(@RequestBody Contractor contractor) {
        return ResponseEntity.ok(contractorService.createContractor(contractor));
    }
@GetMapping
    public ResponseEntity<List<Contractor>> getAllContractors() {
        return ResponseEntity.ok(contractorService.getAllContractors());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Contractor> getContractorById(@PathVariable Long id) {
        return contractorService.getContractorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
@PutMapping("/{id}")
    public ResponseEntity<Contractor> updateContractor(@PathVariable Long id, @RequestBody Contractor contractor) {
        return ResponseEntity.ok(contractorService.updateContractor(id, contractor));
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContractor(@PathVariable Long id) {
        contractorService.deleteContractor(id);
        return ResponseEntity.noContent().build();
    }
}
