package com.space.suppourting.services;

import com.space.suppourting.etity.Student;

import java.util.List;

public interface StudentService {



    List<Student> getAllStudents();

Student saveStudent(Student student);

Student getStudentId(Long id);

Student updateStudent(Student student);

Student deleteStudent(Long id);

}
