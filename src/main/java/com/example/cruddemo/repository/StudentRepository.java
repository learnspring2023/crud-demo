package com.example.cruddemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
