package com.demoproject.restapi.controllers;

import com.demoproject.restapi.models.Student;
import com.demoproject.restapi.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

    @PostMapping("save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
}
