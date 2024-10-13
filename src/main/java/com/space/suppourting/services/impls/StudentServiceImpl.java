package com.space.suppourting.services.impls;

import com.space.suppourting.etity.Student;
import com.space.suppourting.repos.StudentRepo;
import com.space.suppourting.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
    super();
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }



    @Override
    public Student getStudentId(Long id){
       return studentRepo.findById(id).get();
    }
@Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
}

public Student deleteStudent(Long id) {
        Student student = studentRepo.findById(id).get();
        studentRepo.delete(student);

        return student;
}
}
