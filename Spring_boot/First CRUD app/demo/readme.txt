## Description

A simple Spring Boot application to manage books with basic CRUD operations.

## Setup

1. Clone the repository:
  

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

- **GET** `/getAllBooks` → Get all books  
- **GET** `/getBookById/{id}` → Get a book by ID  
- **POST** `/addBook` → Add a new book  
- **POST** `/updateBookById/{id}` → Update a book by ID  
- **DELETE** `/deleteBookById/{id}` → Delete a book by ID  

## H2 Database Console

Access the H2 console at:  
[http://localhost:8080/h2-console]  
- **JDBC URL**: `jdbc:h2:mem:testdb`  
- **Username**: `SA`  
- **Password**: (leave empty)  
