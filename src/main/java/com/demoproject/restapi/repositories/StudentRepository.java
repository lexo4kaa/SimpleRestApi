package com.demoproject.restapi.repositories;

import com.demoproject.restapi.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
