# Civil-Engineering-Project_API
project role as a construction management API for backend.

- ### Project Overview :-

This is a Spring Boot-based backend project for managing civil engineering-related entities. The system includes four main entities with relational mappings and provides a complete REST API for handling CRUD operations. The project includes service, repository, and controller layers and is fully testable via Postman.

- ### **Project Structure :-**

        src/main/java
         └── com/example/civil
              ├── CivilEngineeringApplication.java
              ├── entity
              │    ├── Contractor.java
              │    ├── Project.java
              │    ├── Engineer.java
              │    └── Building.java
              ├── repository
              │    ├── ContractorRepository.java
              │    ├── ProjectRepository.java
              │    ├── EngineerRepository.java
              │    └── BuildingRepository.java
              ├── service
              │    ├── ContractorService.java
              │    ├── ProjectService.java
              │    ├── EngineerService.java
              │    └── BuildingService.java
              └── controller
                   ├── ContractorController.java
                   ├── ProjectController.java
                   ├── EngineerController.java
                   └── BuildingController.java
               
### 1. Create a Contractor
- ### Method: POST
  
- ### URL: http://localhost:8080/api/contractors
  
- ### Body (raw, JSON):
    
                {
              "name": "ABC Constructions",
              "licenseNumber": "LIC12345"
                }

### 2. Get All Contractors
### - Method: GET

### - URL: http://localhost:8080/api/contractors

Create a Project
