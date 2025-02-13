# Nimap-Infotech-Java-Developer-Assignment

# Spring Boot REST API Machine Test - Category & Product CRUD

This project implements a REST API for managing Categories and Products, with a one-to-many relationship between them.  It uses Spring Boot, JPA/Hibernate, and MySQL as the database.  Server-side pagination is implemented for both Category and Product retrieval.

## Features

* **Category CRUD Operations:**
    * GET /api/categories?page={page}: Retrieve all categories with pagination.
    * POST /api/categories: Create a new category.
    * GET /api/categories/{id}: Retrieve a category by ID.
    * PUT /api/categories/{id}: Update a category by ID.
    * DELETE /api/categories/{id}: Delete a category by ID.

* **Product CRUD Operations:**
    * GET /api/products?page={page}: Retrieve all products with pagination.
    * POST /api/products: Create a new product.
    * GET /api/products/{id}: Retrieve a product by ID, including its category details.
    * PUT /api/products/{id}: Update a product by ID.
    * DELETE /api/products/{id}: Delete a product by ID.

* **One-to-Many Relationship:** A Category can have multiple Products.

* **Server-Side Pagination:**  Implemented for retrieving lists of categories and products.

* **Database:** MySQL.

## Technologies Used

* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## How to Run the Code

1. **Clone the Repository:**
   ```bash
   git clone <repository_url>

How to Run the Machine Test
Start the application as described above.

Use Postman or a similar tool to send HTTP requests to the API endpoints.  Example requests:

Get all categories (page 0): GET http://localhost:8080/api/categories?page=0
Create a category: POST http://localhost:8080/api/categories (with category data in the request body as JSON)
Get product by id: GET http://localhost:8080/api/products/1
... and so on for other endpoints.
Database Design
The database schema consists of two tables:

categories:

id (INT, PRIMARY KEY, AUTO_INCREMENT)
name (VARCHAR(255), NOT NULL)
description (TEXT)
products:

id (INT, PRIMARY KEY, AUTO_INCREMENT)
name (VARCHAR(255), NOT NULL)
description (TEXT)
price (DECIMAL)
category_id (INT, FOREIGN KEY referencing categories.id)
The category_id in the products table establishes the one-to-many relationship with the categories table.
