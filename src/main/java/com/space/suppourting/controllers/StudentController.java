package com.space.suppourting.controllers;


import com.space.suppourting.etity.Student;
import com.space.suppourting.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


public class StudentController extends MemberConroler{

StudentService studentService;


@Autowired
public StudentController(StudentService studentService) {
    super();
    this.studentService = studentService;
}




}
