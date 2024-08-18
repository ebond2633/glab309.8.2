package com._982.studentLogin.service;

import com._982.studentLogin.model.Student;

import java.util.List;

public interface StudentService<StudentDTO> {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

