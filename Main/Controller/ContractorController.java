package com.example.civil.controller;

import com.example.civil.entity.Contractor;
import com.example.civil.service.ContractorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/contractors")
public class ContractorController {
    private final ContractorService contractorService;

    public ContractorController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }
  
@PostMapping
    public ResponseEntity<Contractor> createContractor(@RequestBody Contractor contractor) {
        return ResponseEntity.ok(contractorService.createContractor(contractor));
    }
