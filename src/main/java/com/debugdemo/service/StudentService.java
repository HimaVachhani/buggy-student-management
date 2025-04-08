package com.debugdemo.service;

import com.debugdemo.model.Student;
import com.debugdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student) {
        // HINT: Check if adding 5 to age is correct
        student.setAge(student.getAge() + 5); // 🐞 Bug: Logical error
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> studentOpt = repository.findById(id);
        // HINT: What happens if student is not found?
        return studentOpt.orElse(null); // 🐞 Bug: Should handle not found properly
    }
}