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



// HibernateMethod , returning model and view
    @GetMapping("/students")
    public String  listStudents(Model model) {
model.addAttribute("students", studentService.getAllStudents());
return "students";
    }

 //add new student
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

@GetMapping("/students/edit/{id}")
public String editStudent(@PathVariable Long id, Model model) {

    model.addAttribute("student", studentService.getStudentId(id));

return "edit-student";

}

@PostMapping("/students/{id}")
public String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student, Model model) {


    Student editedStudent = studentService.getStudentId(id);
    editedStudent.setId(id);
editedStudent.setFirstName(student.getFirstName());
editedStudent.setStatus(student.getStatus());
editedStudent.setContact(student.getContact());


studentService.updateStudent(editedStudent);

return "redirect:/students";

}

@GetMapping("/students/{id}")
public String deleteStudent(@PathVariable Long id, Model model) {

    Student student = studentService.deleteStudent(id);

    return "redirect:/students";

}



}
