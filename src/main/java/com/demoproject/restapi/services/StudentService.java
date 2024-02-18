package com.demoproject.restapi.services;

import com.demoproject.restapi.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().email("vasya@gmail.com").firstName("Vasya").build(),
                Student.builder().email("p3ject@gmail.com").build()
        );
    }
}
