# test-Api
normal test api for put get delete method
 Spring Boot In-Memory Model API

This is a simple **Spring Boot REST API** project built using a **Three Layer Architecture**.

It uses:

In-Memory Database (HashMap)  
DTO + Validation  
 Repository + Service Interfaces  
 ResponseEntity with Proper HTTP Status  
 Global Exception Handling  

---

##  Features

- Create Model (POST)
- Get All Models (GET)
- Get Model by ID (GET)
- Delete Model (DELETE)
- Validation Support
- Custom Error Responses

---

##  Project Architecture

Controller Layer
↓
Service Layer (Interface + Implementation)
↓
Repository Layer (Interface + Implementation)
↓
InMemoryDatabase (Static HashMap Storage)

DTO Validation

Global Exception Handler


---

##  Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Validation
- In-Memory Storage (HashMap)

---

##  API Endpoints

Base URL:

http://localhost:8080/api/models


---

#  1. Create Model

### Endpoint

POST /api/models


### Request Body

```json
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 60000,
  "category": "Electronics"
}
Response (201 CREATED)
{
  "id": 3,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 60000,
  "category": "Electronics"
}
 Note: ID is auto-generated.

 2. Get All Models
Endpoint
GET /api/models
Response (200 OK)
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 60000,
    "category": "Electronics"
  },
  {
    "id": 2,
    "name": "Book",
    "description": "Java Book",
    "price": 500,
    "category": "Education"
  }
]
 3. Get Model By ID
Endpoint
GET /api/models/{id}
Example:

GET /api/models/1
Response (200 OK)
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 60000,
  "category": "Electronics"
}
 4. Delete Model
Endpoint
DELETE /api/models/{id}
Example:

DELETE /api/models/1
Response (200 OK)
Model deleted successfully!
 Error Handling
1. Model Not Found (404)
Request:

GET /api/models/100
Response:

{
  "error": "Model not found with id: 100"
}
2. Validation Errors (400)
Request:

{
  "name": "",
  "description": "",
  "price": 0,
  "category": null
}
Response:

{
  "name": "Name cannot be empty",
  "description": "Description cannot be empty",
  "price": "Price must be greater than 0",
  "category": "Category cannot be null"
}
Preloaded Data
The application loads some data automatically using a static block:

static {
    modelTable.put(1L, new Model(...));
    modelTable.put(2L, new Model(...));
}
So when the server starts, GET /api/models will already return sample models.

▶️ How to Run the Project
