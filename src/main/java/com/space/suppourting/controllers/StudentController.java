package com.space.suppourting.controllers;


import com.space.suppourting.etity.Student;
import com.space.suppourting.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
return "students";
    }

// add new student
    @GetMapping("/students/new")
    public String createStudent(Model model) {

    model.addAttribute("student", new Student());
    return "add-student";
    }


@PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student) {
studentService.saveStudent(student);
    return "redirect:/students";
}




}
