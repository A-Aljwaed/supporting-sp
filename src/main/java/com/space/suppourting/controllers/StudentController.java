package com.space.suppourting.controllers;


import com.space.suppourting.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

StudentService studentService;


@Autowired
public StudentController(StudentService studentService) {
    this.studentService = studentService;
}



// HibernateMethod , returning model and view
    @GetMapping("/students")
    public String  listStudents(Model model) {
model.addAttribute("students", studentService.getAllStudents());
return "studens";
    }








}
