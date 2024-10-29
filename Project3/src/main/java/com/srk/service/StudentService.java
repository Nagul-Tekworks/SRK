package com.srk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.entity.Student;
import com.srk.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	public String saveStudent(Student std) {
		
		studentRepo.save(std);
		
		return "Student record inserted successfully";
	}
}
