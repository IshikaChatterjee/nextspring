package com.example.springbootapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootapi.Entity.Student;
import com.example.springbootapi.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired 
    private StudentRepo studentRepo;

    @SuppressWarnings("null")
    public Student saveDetails(Student student){

        return studentRepo.save(student);
    }

    public List<Student> getAllDetails(){

        return studentRepo.findAll();
    }

}
