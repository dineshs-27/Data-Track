package com.example.project.Student.Management.service.Impl;
import com.example.project.Student.Management.entity.student;
import com.example.project.Student.Management.repository.studentRepo;
import com.example.project.Student.Management.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class studentServiceImpl implements studentService {
    private final studentRepo studentrepo;
    @Autowired
    public studentServiceImpl(studentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    @Override
    public List<student> getAllstudents() {
        return studentrepo.findAll();
    }

    @Override
    public student saveStudent(student student) {
        return studentrepo.save(student);
    }

    @Override
    public student getStudentById(Long id) {
        return studentrepo.findById(id).get();
    }

    @Override
    public student updateStudent(student student) {
        return studentrepo.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentrepo.deleteById(id);
    }

}