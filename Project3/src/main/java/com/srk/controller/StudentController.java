package com.srk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srk.entity.Student;
import com.srk.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	//http://localhost:8080/savestd
	
	@PostMapping("/savestd")
	public String saveStudentDetails(@RequestBody() Student std) {
		
		String str=studentService.saveStudent(std);
		return str;
	}
}
