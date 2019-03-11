package com.phase3.demo.repository;

import com.phase3.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends JpaRepository<Student,Long> {
}
