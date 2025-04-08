package com.debugdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// NOTE: This project was intentionally created with bugs for Java debugging practice only.

@SpringBootApplication
public class BuggyStudentManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuggyStudentManagementApplication.class, args);
    }
}