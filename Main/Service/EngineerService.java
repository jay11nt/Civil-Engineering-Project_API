package com.example.civil.service;

import com.example.civil.entity.Engineer;
import com.example.civil.repository.EngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EngineerService 
{
    private final EngineerRepository engineerRepository;

public EngineerService(EngineerRepository engineerRepository) 
    {
        this.engineerRepository = engineerRepository;
    }

    public Engineer createEngineer(Engineer engineer) {
        return engineerRepository.save(engineer);
    }

public List<Engineer> getAllEngineers() {
        return engineerRepository.findAll();
    }

    public Optional<Engineer> getEngineerById(Long id) {
        return engineerRepository.findById(id);
    }
public Engineer updateEngineer(Long id, Engineer engineerDetails) {
        Engineer engineer = engineerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Engineer not found"));
        engineer.setName(engineerDetails.getName());
        engineer.setSpecialization(engineerDetails.getSpecialization());
        engineer.setProject(engineerDetails.getProject());
        return engineerRepository.save(engineer);
    }
public void deleteEngineer(Long id) {
        engineerRepository.deleteById(id);
    }
}
