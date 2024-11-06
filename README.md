# Spring Boot Hibernate

This project demonstrates how to integrate **Spring Boot** with **Hibernate** for persistence management. It showcases the usage of **JPA** (Java Persistence API) with **Hibernate** as the ORM (Object Relational Mapping) framework to perform CRUD operations on a database.


## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)

## Features
- Integration of **Spring Boot** with **Hibernate** for JPA-based database interaction.
- Perform CRUD operations (Create, Read, Update, Delete) using **Spring Data JPA** and **Hibernate**.
- Simple setup with a REST API to interact with the database.

## Technologies Used
- **Spring Boot** (backend framework)
- **Hibernate** (ORM framework)
- **JPA** (Java Persistence API)
- **Maven** (dependency management)

## Project Structure
```
src/main/java
    ├── controller      # Controller handling API requests
    ├── model           # Model representing data entities
    ├── repository      # Spring Data JPA repository interfaces
    ├── service # Service layer to handle business logic 
src/main/resources
    └── application.properties # Database connection and application configuration

```

## Prerequisites
- **JDK 8** or higher
- **Maven** for dependency management
- **Hibernate** for ORM support
- **Database** (e.g., MySQL, PostgreSQL) for persistence

## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/rabiyag/spring-boot-hibernate.git
   cd spring-boot-hibernate
   ```


2. **Set up the PostgreSQL database**:
   - Create a new database in PostgreSQL:
    ```sql
    CREATE DATABASE springbootdb;
    ```
   
3. **Configure database connection**:
   - Update the application.properties file with your PostgreSQL connection details
     ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
     ```

4. **Build the project with Maven**:
   ```bash
   mvn clean install
   ```

## Running the Application
1. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the application**:
   - The application will be available at http://localhost:8080:
  

## Usage
The project provides a RESTful API for performing CRUD operations on the database. You can interact with the endpoints exposed by the controllers.
