package com.phase3.demo.impl;

import com.phase3.demo.model.Student;
import com.phase3.demo.repository.StudentRepository;
import com.phase3.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public String saveStudent(Student student) {
        repo.save(student);
        return "Successfully saved";
    }

    @Override
    public String updateStudent(Student student) {
        repo.saveAndFlush(student);
        return "Successfully uupdated student";
    }

    @Override
    public String deleteStudent(long id) {
        repo.deleteById(id);
        return "Successfully deleted student";
    }

    @Override
    public Student retriveStudent(long id) {
        return repo.getOne(id);
    }
}
