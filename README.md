# Assistants Management Application
A Spring Boot application which facilitates the management of assistants, offering comprehensive CRUD(Create,Read,Update & Delete) functionalities for handling assistant entities.

## Overview

The Assistants Management Application is designed to simplify the process of managing assistant records within an organization. With this application, users can perform basic CRUD operations on assistant entities, including creating new assistants, retrieving their details, updating existing records, and deleting entries.

## Features

- Create new assistant records with relevant details such as name, mobile number, email, salary, city, country, department, and role.
- Retrieve detailed information about assistants by their unique identifiers (IDs).
- Update existing assistant records with updated information.
- Delete assistant records from the system.

## Technologies Used

- Java
- Spring Boot
- MySQL
- Maven (for dependency management)
- postman (for testing purpose)

## Dependencies used

- Spring web
- MySQL connector
- Spring Data JPA

## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/akshata-thorkar/Hirademy_Backend_Assignment.git

2. **Database Configuration:**

- Create a MySQL database named 'assistants_db' (or a name of your choice).
- Update the database connection details in the 'application.properties' file located in 'src/main/resource'
  ```properties
  spring.application.name=assignment 
  spring.datasource.url=jdbc:mysql://localhost:3306/assistants_db  
  spring.datasource.username="your_mysql_username"  
  spring.datasource.password="your_mysql_password"  
  spring.jpa.hibernate.ddl-auto=update  
  server.port=7777 (or as per your choice)

  

3. **Build and Run the Application:**
 - Navigate to the project directory:
   ```bash
   cd assignment
 - Build the application using Maven:
   ```bash
   mvn clean install
 - Run the application:
   ```bash
   java -jar target/assignment.jar

   This springBoot application will run on http://localhost:7777

4. **Testing**
  - A postman collection json file named as Assistant API Testing.postman_collection.json is included in this repo,import this in your postman application.
  - Use the imported Postman collection to send requests to the following API endpoints provided you have started your SpringBoot application:
     ```endpoints
     POST /assistant: Create a new assistant.
     GET /assistant/{id}: Retrieve details of an assistant by its ID.
     PUT /assistant/{id}: Update an existing assistant.
     DELETE /assistant/{id}: Delete an assistant by its ID.
    
  - For particular assistant interaction,change id that you want to interact with
     





