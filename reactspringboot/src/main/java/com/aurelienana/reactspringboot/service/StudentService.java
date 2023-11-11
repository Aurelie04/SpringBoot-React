package com.aurelienana.reactspringboot.service;

import com.aurelienana.reactspringboot.model.Student;

import java.util.List;

public interface StudentService {

    public Student storeStudent(Student student);
    public List<Student> getAllStudent();
}
