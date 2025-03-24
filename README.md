# Civil-Engineering-Project_API
project role as a construction management API for backend.


## **Project Structure-**

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
               
## Create a Contractor

### - Method: POST
  
### - URL: http://localhost:8080/api/contractors
  
### - Body (raw, JSON):
    
                {
              "name": "ABC Constructions",
              "licenseNumber": "LIC12345"
                }

### - Get All Contractors
### - Method: GET

### - URL: http://localhost:8080/api/contractors
