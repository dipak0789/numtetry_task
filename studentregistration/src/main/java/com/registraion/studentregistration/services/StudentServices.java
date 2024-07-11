package com.registraion.studentregistration.services;

import java.util.List;

import com.registraion.studentregistration.module.Student;

public interface StudentServices {

	public Student saveStudent(Student student);
	
	public List<Student>studentList();
	
}
