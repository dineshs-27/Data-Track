package com.example.project.Student.Management.controller;
import com.example.project.Student.Management.entity.student;
import com.example.project.Student.Management.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class studentController {

    private final studentService studentservice;

    public studentController(studentService studentservice) {
        this.studentservice = studentservice;
    }

    //Handler method to handle list of students and return mode and view
    @GetMapping("/students")
    public String liststudents(Model model){
        model.addAttribute("students",studentservice.getAllstudents());
        return "students";
    }

    @GetMapping("/students/new_student")
    public String createstudent(Model model){
        student s1 = new student();
        model.addAttribute("student", s1);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") student student) {
        studentservice.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit_student/{id}")
    public String editstudent(@PathVariable Long id,Model model){
        model.addAttribute("student",studentservice.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updatestudent(@PathVariable Long id, @ModelAttribute("student") student student, Model model){
        student existingstudent = studentservice.getStudentById(id);
        existingstudent.setId(id);
        existingstudent.setName(student.getName());
        existingstudent.setEmail(student.getEmail());
        studentservice.updateStudent(existingstudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deletestudent(@PathVariable Long id){
        studentservice.deleteStudentById(id);
        return "redirect:/students";
    }
}