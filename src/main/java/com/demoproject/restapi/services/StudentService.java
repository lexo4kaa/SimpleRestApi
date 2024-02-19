package com.demoproject.restapi.services;

import com.demoproject.restapi.models.Student;
import com.demoproject.restapi.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }
}
