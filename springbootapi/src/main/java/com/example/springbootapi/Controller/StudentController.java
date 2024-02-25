package com.example.springbootapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapi.Entity.Student;
import com.example.springbootapi.Service.StudentService;



@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        
        return studentService.saveDetails(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllDetails() {

        return studentService.getAllDetails();
    }
    

}
