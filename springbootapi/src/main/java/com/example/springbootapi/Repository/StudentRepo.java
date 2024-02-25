package com.example.springbootapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootapi.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
