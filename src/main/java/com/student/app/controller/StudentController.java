package com.student.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.entity.StudentEntity;
import com.student.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student){
		
		StudentEntity savedEntity =  studentService.saveStudent(student);
		
		return new ResponseEntity<StudentEntity>(savedEntity, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentEntity>> fetchAllStudents(){
		
		List<StudentEntity> allStudents = studentService.fetchAllStudents();
		return new ResponseEntity<List<StudentEntity>>(allStudents, HttpStatus.OK);
	}
}
