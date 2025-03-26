# Civil-Engineering-Project_API
project role as a construction management API for backend.

- ### Project Overview :-

This is a Spring Boot-based backend project for managing civil engineering-related entities. The system includes four main entities with relational mappings and provides a complete REST API for handling CRUD operations. The project includes service, repository, and controller layers and is fully testable via Postman.

- ### Technologies Used :-

  - Java

  - Spring Boot

  - Spring Data JPA

  - Hibernate

  - MySQL

  - Postman (for API testing)

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

- ### Entities and Relationships

 1. Project - Represents a civil construction project.

 2. Contractor - Manages details of contractors.

 3. Material - Stores material-related information.

 4. Worker - Stores worker details, associated with a project.

- ### Relationships:
 
1. One Project can have many Workers.

2. One Contractor can handle multiple Projects.

3. One Project can use multiple Materials.

4. Many Workers can work under one Contractor.



- ## API Endpoints
### 1. Create a Contractor
- Method: POST
  
- URL: http://localhost:8080/api/contractors
  
- Body (raw, JSON):
    
                {
              "name": "ABC Constructions",
              "licenseNumber": "LIC12345"
                }

### 2. Get All Contractors
- Method: GET

- URL: http://localhost:8080/api/contractors

### Create a Project
