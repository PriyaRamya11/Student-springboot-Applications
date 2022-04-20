package com.example.dome.service;

import com.example.dome.model.Student;

import java.util.List;

public interface StudentService {

public List<Student> getAllStudent();
public Student createStudent( Student student);
}
