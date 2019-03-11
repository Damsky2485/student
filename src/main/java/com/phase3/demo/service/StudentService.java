package com.phase3.demo.service;

import com.phase3.demo.model.Student;

public interface StudentService {
    String saveStudent(Student student);
    String updateStudent(Student student);
    String deleteStudent(long id);
    Student retriveStudent(long id);
}
