package com.student.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.entity.StudentEntity;
import com.student.app.repostiory.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;

	
	public StudentEntity saveStudent(StudentEntity student) {
	
		StudentEntity saved = studentRepo.save(student);
		return saved;
	}

	
	public List<StudentEntity> fetchAllStudents() {
		
		List<StudentEntity> all = studentRepo.findAll();
		return all;
	}
}
