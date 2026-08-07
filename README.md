# 🔐 Secure REST API Scanner

A Java-based Secure REST API Scanner that performs GET, POST, PUT, and DELETE requests, analyzes HTTP responses, measures response time, and checks HTTPS and security headers.

---

## 📖 Overview

Secure REST API Scanner is a console-based Java application built using the Java HttpClient API. It allows users to send HTTP requests to REST APIs and analyze the responses. The application also performs basic security analysis by checking HTTPS usage and common security-related HTTP headers.

This project demonstrates fundamental backend development concepts such as REST APIs, HTTP communication, JSON request handling, response processing, and basic API security analysis.

---

## ✨ Features

- ✅ GET Request
- ✅ POST Request
- ✅ PUT Request
- ✅ DELETE Request
- ✅ JSON Request Body Support
- ✅ HTTP Response Status Code
- ✅ HTTP Response Headers
- ✅ HTTP Response Body
- ✅ HTTPS Detection
- ✅ Security Header Analysis
- ✅ Response Time Measurement

---

## 🛠 Technologies Used

- Java
- Java HttpClient
- REST API
- HTTP / HTTPS
- JSON
- Git
- GitHub

---

## 📂 Project Structure

```text
secure-rest-api-scanner
│
├── src
│   └── main
│       └── java
│           └── com
│               └── subhashish
│                   └── scanner
│                       └── App.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## 🚀 How to Run

1. Clone the repository.

```bash
git clone https://github.com/Subhashish22/secure-rest-api-scanner.git
```

2. Open the project in VS Code or IntelliJ IDEA.

3. Run `App.java`.

4. Choose an HTTP method:

```
1. GET
2. POST
3. PUT
4. DELETE
```

5. Enter the API URL.

6. For POST and PUT requests, enter a valid JSON request body.

7. View the response, headers, response time, HTTPS status, and security header analysis.

---

## 🧪 Sample API

### GET

```
https://jsonplaceholder.typicode.com/posts/1
```

### POST

```
https://jsonplaceholder.typicode.com/posts
```

### PUT

```
https://jsonplaceholder.typicode.com/posts/1
```

### DELETE

```
https://jsonplaceholder.typicode.com/posts/1
```

---

## 📋 Sample JSON Body

```json
{
  "title": "Java",
  "body": "Learning REST API",
  "userId": 1
}
```

---

## 📊 Sample Output

```text
========== RESPONSE ==========
Status Code : 200
Response Time : 145 ms

========== HTTPS ==========
HTTPS : YES ✅

========== SECURITY HEADERS ==========
x-content-type-options : YES ✅
x-frame-options : NO ❌
content-security-policy : NO ❌
strict-transport-security : NO ❌
```

---

## 📚 Concepts Learned

- Java HttpClient
- HTTP & HTTPS
- REST API
- GET, POST, PUT & DELETE Requests
- JSON Request Body
- HTTP Headers
- Response Handling
- Basic API Security
- Response Time Measurement
- Git & GitHub Workflow

---

## 🔮 Future Improvements

- Security Risk Score
- Export Report to PDF
- API Authentication Support
- Multi -threaded API Scanning
- GUI using JavaFX
- Spring Boot Integration
- HTML/PDF Security Report

---

## 👨‍💻 Author

**Subhashish Dutta**

- GitHub: https://github.com/Subhashish22

---

## ⭐ Project Status

**Version 1.0 – Completed**

This project was built as part of my Java Backend Development learning journey to understand REST APIs, HTTP communication, and basic API security analysis.
