package com.example.civil.service;

import com.example.civil.entity.Building;
import com.example.civil.repository.BuildingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService 
{
    private final BuildingRepository buildingRepository;

public BuildingService(BuildingRepository buildingRepository) 
    {
        this.buildingRepository = buildingRepository;
    }
 public Building createBuilding(Building building) {
        return buildingRepository.save(building);
    }
public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }
public Optional<Building> getBuildingById(Long id) {
        return buildingRepository.findById(id);
    }
public Building updateBuilding(Long id, Building buildingDetails) {
        Building building = buildingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Building not found"));
        building.setName(buildingDetails.getName());
        building.setAddress(buildingDetails.getAddress());
        building.setProject(buildingDetails.getProject());
        return buildingRepository.save(building);
    }
public void deleteBuilding(Long id) {
        buildingRepository.deleteById(id);
    }
}
