package com.registraion.studentregistration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registraion.studentregistration.dao.StudentRepo;
import com.registraion.studentregistration.module.Student;

@Service
public class StudentServicesImp implements StudentServices {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> studentList() {
		List<Student> findAll = studentRepo.findAll();
		return findAll;
	}
	
	
}
