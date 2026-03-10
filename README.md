# 🚀 EM Service – Employee Management System

A **Full Stack Employee Management System** built using **Spring Boot, React.js, and MySQL**.
This project demonstrates how to build a **complete CRUD application with REST APIs and a modern frontend**.

The system allows users to **add, view, update, and delete employee records** through a responsive web interface.

---

# 📌 Project Overview

**EM Service** is a full-stack web application designed to manage employee data efficiently.

It demonstrates:

* REST API development with **Spring Boot**
* Database integration using **Spring Data JPA + MySQL**
* Frontend development using **React.js**
* API communication using **Axios**

---

# 🏗 System Architecture

```
User Browser
     │
     ▼
React Frontend (Port 3000)
     │
     ▼
Spring Boot REST API (Port 9090)
     │
     ▼
MySQL Database
```

---

# 🛠 Tech Stack

## Backend

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* MySQL

## Frontend

* React.js
* React Router
* Axios
* Tailwind CSS

## Tools & Technologies

* Git
* GitHub
* VS Code
* Postman
* MySQL Workbench
* Node.js
* Maven

---

# ✨ Features

✔ Add New Employee
✔ View All Employees
✔ Update Employee Information
✔ Delete Employee
✔ REST API Architecture
✔ React Frontend Integration
✔ Responsive UI using TailwindCSS
✔ MySQL Database Persistence

---

# 📂 Project Structure

```
EM-Project
│
├── em-project-backend
│   │
│   ├── src/main/java/com/osjlabs/em_project
│   │   ├── controller
│   │   │    └── EmpController.java
│   │   │
│   │   ├── entity
│   │   │    ├── Employee.java
│   │   │    └── EmployeeEntity.java
│   │   │
│   │   ├── repository
│   │   │    └── EmployeeRepository.java
│   │   │
│   │   ├── service
│   │   │    ├── EmployeeService.java
│   │   │    └── impl
│   │   │         └── EmployeeServiceImpl.java
│   │   │
│   │   └── EmProjectApplication.java
│   │
│   ├── src/main/resources
│   │    └── application.properties
│   │
│   └── pom.xml
│
└── em-project-frontend
    │
    ├── src
    │   ├── components
    │   │    ├── AddEmployee.js
    │   │    ├── EmployeeList.js
    │   │    ├── Navbar.js
    │   │    └── UpdateEmployee.js
    │   │
    │   ├── service
    │   │    └── EmployeeService.js
    │   │
    │   ├── App.js
    │   ├── index.js
    │   └── styles
    │
    └── package.json
```

---

# ⚙️ Installation & Run Locally

## 1️⃣ Clone Repository

```bash
git clone https://github.com/Omkar7143/EM-Project.git
```

Navigate into the project

```bash
cd EM-Project
```

---

# 🔧 Backend Setup (Spring Boot)

Navigate to backend folder

```bash
cd em-project-backend
```

Run Spring Boot application

```bash
mvn spring-boot:run
```

Backend will start on:

```
http://localhost:9090
```

---

# 💻 Frontend Setup (React)

Navigate to frontend folder

```bash
cd em-project-frontend
```

Install dependencies

```bash
npm install
```

Run React application

```bash
npm start
```

Frontend will start on:

```
http://localhost:3000
```

---

# 🔌 API Endpoints

## Get All Employees

```
GET /employees
```

## Get Employee By ID

```
GET /employees/{id}
```

## Create Employee

```
POST /employees
```

Example request body:

```json
{
  "name": "Omkar",
  "phone": "9876543210",
  "email": "omkar@email.com"
}
```

## Update Employee

```
PUT /employees/{id}
```

## Delete Employee

```
DELETE /employees/{id}
```

---

# 🗄 Database Configuration

Database used: **MySQL**

Update your `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/osjlabs
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 📸 Project Screenshots

### Employee Dashboard



<img width="1920" height="1020" alt="em-project ss" src="https://github.com/user-attachments/assets/5897c701-179c-4e34-b92e-b4d084d463bf" />

---

# 🔮 Future Improvements

* User Authentication (JWT + Spring Security)
* Role Based Access
* Pagination & Sorting
* Search Employees
* Docker Containerization
* CI/CD Pipeline
* Cloud Deployment

---

# 👨‍💻 Author

**Omkar Jadhav**

GitHub
https://github.com/Omkar7143

---

# 📄 License

This project is licensed under the **MIT License**.

You are free to use, modify, and distribute this project.

---

# ⭐ Support

If you like this project, consider giving it a **star ⭐ on GitHub**.

It helps others discover the project and motivates further improvements.

---
