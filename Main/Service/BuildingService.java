package com.example.civil.service;

import com.example.civil.entity.Building;
import com.example.civil.repository.BuildingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {
    private final BuildingRepository buildingRepository;

public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }
