package com.example.civil.service;

import com.example.civil.entity.Engineer;
import com.example.civil.repository.EngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EngineerService {
    private final EngineerRepository engineerRepository;

public EngineerService(EngineerRepository engineerRepository) {
        this.engineerRepository = engineerRepository;
    }

    public Engineer createEngineer(Engineer engineer) {
        return engineerRepository.save(engineer);
    }
