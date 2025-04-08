# 🐞 Buggy Student Management – Debugging Practice Project

This is a small **Java Spring Boot** project intentionally built with **common bugs** for **learning and debugging practice**.

---

## 📘 About This Project

As a **Java backend fresher**, I used this project to improve my **debugging skills**. The application simulates a basic Student Management system with the following features:

- Add new students
- Get all students
- Get a student by ID

---

## 🎯 Objective

The **main goal** of this project is **not** to build a production-grade system, but to:
- Identify and fix **logical**, **HTTP**, and **exception-handling** bugs
- Learn how to **set breakpoints**, use **debug mode** in IntelliJ, and understand the flow
- Practice working with Spring Boot structure: `Controller → Service → Repository → Entity`

---

## 🐞 List of Bugs Fixed

| 🔢 | Bug Type                        | File / Method                       | Fixed? |
|-----|--------------------------------|-------------------------------------|--------|
| 1   | Logical Error: Age incremented wrongly | `StudentService.addStudent()`         | ✅     |
| 2   | Incorrect HTTP Status (200 instead of 404) | `StudentController.getById()`        | ✅     |
| 3   | Unsafe handling of null from `Optional` | `StudentService.getStudentById()`    | ✅     |

---

## 💻 Tech Stack

- Java 17+
- Spring Boot 3.x
- H2 In-Memory Database
- IntelliJ IDEA (Free Community Edition)
- GitHub Desktop (for version control)

---



