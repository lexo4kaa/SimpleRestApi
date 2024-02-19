package com.demoproject.restapi.services;

import com.demoproject.restapi.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
}
