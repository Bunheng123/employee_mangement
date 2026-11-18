# Employee Management System

A Spring Boot application for managing employee data and workflows.

## Tech Stack
- **Java 21**
- **Spring Boot 4.1.2**
  - Spring Data JPA
  - Spring Web MVC
  - Spring Validation
- **PostgreSQL**
- **Lombok**
- **Maven**

## Getting Started

### Prerequisites
- JDK 21
- PostgreSQL

### Database Configuration
Ensure PostgreSQL is running and update `src/main/resources/application.properties` if needed:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=postgres
spring.datasource.password=123
```

### Running the Application
Using the Maven wrapper:
```powershell
.\mvnw.cmd spring-boot:run
```
The application will start on port `9000`.
