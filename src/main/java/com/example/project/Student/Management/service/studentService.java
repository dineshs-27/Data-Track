package com.example.project.Student.Management.service;
import com.example.project.Student.Management.entity.student;
import java.util.List;

public interface studentService {
    List<student> getAllstudents();

    student saveStudent(student student);

    student getStudentById(Long id);

    student updateStudent(student student);

    void deleteStudentById(Long id);
}