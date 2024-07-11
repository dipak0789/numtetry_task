package com.registraion.studentregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registraion.studentregistration.module.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
