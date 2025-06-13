# 📦 Product Analog System

A Spring Boot REST API for managing products using PostgreSQL as the database.

---

## ✅ Features

* CRUD operations for products.
* Filter products by category.
* Connects to PostgreSQL database.

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot
* **Database:** PostgreSQL
* **Language:** Java

---

## ⚙️ Database Configuration

Make sure PostgreSQL is running and create a database named:

```sql
CREATE DATABASE productanalog;
```

In your `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/productanalog
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 📚 API Endpoints

### 📥 POST - Add New Product

**URL:** `/product`
**Request Body:**

```json
{
  "name": "Laptop",
  "category": "Electronics",
  "price": 599.99,
  "available": true
}
```

**Response:**
Returns the created product.

---

### 📤 GET - Retrieve All Products

**URL:** `/products`
**Response:**
Returns a list of all products.

---

### 🔍 GET - Retrieve Product by ID

**URL:** `/product/{id}`
**Response:**
Returns the product with the specified ID.

---

### 🟒️ GET - Retrieve Products by Category

**URL:** `/products/category/{cat}`
**Response:**
Returns all products from the given category.

---

### ✏️ PUT - Update Product by ID

**URL:** `/product/{id}`
**Request Body:**

```json
{
  "name": "Updated Laptop",
  "category": "Electronics",
  "price": 499.99,
  "available": false
}
```

**Response:**
Returns the updated product.

---

### 🗑️ DELETE - Delete Product by ID

**URL:** `/product/{id}`
**Response:**
Returns a success message if the product is deleted.

---

## 🚀 Running the Application

1. Start PostgreSQL server.
2. Run the Spring Boot project using:

```bash
mvn spring-boot:run
```

3. Test the APIs using Postman or cURL.

---

## 🔗 Recommended Tools

* PostgreSQL
* Postman
* IntelliJ IDEA or VS Code

---

## 👨‍💻 Author

**Naman Garg**

---

For additional support, feel free to reach out!
