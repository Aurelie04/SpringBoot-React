package com.aurelienana.reactspringboot.controller;

import com.aurelienana.reactspringboot.model.Student;
import com.aurelienana.reactspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {

       studentService.storeStudent(student);

       return "Student successfully added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
}
