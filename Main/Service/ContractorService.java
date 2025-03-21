package com.example.civil.service;

import com.example.civil.entity.Contractor;
import com.example.civil.repository.ContractorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ContractorService {
    private final ContractorRepository contractorRepository;

    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

public Contractor createContractor(Contractor contractor) {
        return contractorRepository.save(contractor);
    }

    public List<Contractor> getAllContractors() {
        return contractorRepository.findAll();
    }
public Optional<Contractor> getContractorById(Long id) {
        return contractorRepository.findById(id);
    }

public Contractor updateContractor(Long id, Contractor contractorDetails) {
        Contractor contractor = contractorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contractor not found"));
        contractor.setName(contractorDetails.getName());
        contractor.setLicenseNumber(contractorDetails.getLicenseNumber());
        return contractorRepository.save(contractor);
    }

public void deleteContractor(Long id) {
        contractorRepository.deleteById(id);
    }
}
