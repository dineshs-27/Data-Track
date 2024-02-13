package com.example.project.Student.Management.repository;
import com.example.project.Student.Management.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<student, Long> {

}