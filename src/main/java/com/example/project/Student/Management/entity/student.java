package com.example.project.Student.Management.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class student {
    @Id
    @SequenceGenerator(name = "std_seq",sequenceName = "std_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "std_seq")
    private Long id;
    private String name;
    private String email;

    public student(){
    }
    public student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}