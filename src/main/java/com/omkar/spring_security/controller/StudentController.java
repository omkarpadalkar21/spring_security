package com.omkar.spring_security.controller;

import com.omkar.spring_security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(
            List.of(new Student(1, "Omkar", 78),
                    new Student(2, "Rakmo", 87))
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}
