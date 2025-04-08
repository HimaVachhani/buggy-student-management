package com.debugdemo.controller;

import com.debugdemo.model.Student;
import com.debugdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        // HINT: Try debugging student age before/after saving
        Student saved = studentService.addStudent(student);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            // 🐞 Bug: Wrong status returned when student not found
            return new ResponseEntity<>(HttpStatus.OK); // HINT: Should it be NOT_FOUND?
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}