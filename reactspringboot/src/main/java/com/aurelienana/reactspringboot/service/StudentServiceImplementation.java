package com.aurelienana.reactspringboot.service;


import com.aurelienana.reactspringboot.model.Student;
import com.aurelienana.reactspringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation  implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student storeStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
