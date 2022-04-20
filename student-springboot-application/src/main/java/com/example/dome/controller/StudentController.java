package com.example.dome.controller;

import com.example.dome.model.Student;
import com.example.dome.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String getAllStudents(Model model)
    {
        List<Student> list =studentService.getAllStudent();
        model.addAttribute("students", list);
        return "student-list";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel)
    {
        Student theStudent = new Student();
        theModel.addAttribute("students", theStudent);
        return "student-form";

    }


}
