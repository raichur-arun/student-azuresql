package com.student.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="students")
@Getter
@Setter
public class StudentEntity {

	@Id
	@GeneratedValue
	private int id;
	private String student_name;
	private String branch;
	private String address;
	
}
