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



## API Endpoints :-
### 1. Project API
Create a Project- 
  
     POST /api/projects

Request Body:

    {
    "name": "Highway Expansion",
    "budget": 5000000.0,
    "contractorId": 1
    }

Response:

      {
        "id": 1,
        "name": "Highway Expansion",
        "budget": 5000000.0,
        "contractor": {
          "id": 1,
          "name": "ABC Constructions"
        }
      }

### 2. Contractor API

Get All Contractors-

    GET /api/contractors

Response:

    [
      {
        "id": 1,
        "name": "ABC Constructions"
      }
    ]
     
### 3. Material API

Add Material

    POST /api/materials

Request Body:

    {
      "name": "Cement",
      "price": 300,
      "projectId": 1
    }
    
Response:

    {
      "id": 1,
      "name": "Cement",
      "price": 300,
      "project": {
        "id": 1,
        "name": "Highway Expansion"
      }
    }

### 4. Worker API

Assign Worker to a Project

    POST /api/workers

Request Body:
    {
      "name": "John Doe",
      "role": "Engineer",
      "projectId": 1
    }

Response:

    {
      "id": 1,
      "name": "John Doe",
      "role": "Engineer",
      "project": {
        "id": 1,
        "name": "Highway Expansion"
      }
    }
