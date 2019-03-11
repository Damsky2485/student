package com.phase3.demo.controller;

import com.phase3.demo.model.Student;
import com.phase3.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/api/save")
    public String saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/api/update")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(value = "/api/retrive", method = RequestMethod.GET)
    public Student retriveStudent(@RequestParam("id")long id){
        return studentService.retriveStudent(id);
    }

    @RequestMapping(value = "/api/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id")long id){
        return studentService.deleteStudent(id);
    }
}
