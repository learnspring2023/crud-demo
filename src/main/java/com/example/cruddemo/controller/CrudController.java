package com.example.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Student;
import com.example.cruddemo.repository.StudentRepository;

@RestController
public class CrudController {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("get-all-students")
	public List<Student> addStudent() {
		return studentRepository.findAll();
	}

//	@PostMapping
//	public Integer addStudent(Student student) {
//		return studentRepository.save(student);
//	}

}
