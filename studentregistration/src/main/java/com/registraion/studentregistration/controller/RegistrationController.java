package com.registraion.studentregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registraion.studentregistration.module.Student;
import com.registraion.studentregistration.module.StudentLogin;
import com.registraion.studentregistration.services.StudentServices;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {

	@Autowired
	private StudentServices studentServises;
	
	@GetMapping("/registerstudent")
	public String registerStudent(Model model) {
		model.addAttribute("student" , new Student());
		return "studentregistration";	
	}
	
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("student")Student student, BindingResult br) {
	
		if(br.hasErrors()) {
			return "studentregistration";
		}
		studentServises.saveStudent(student);
		return "redirect:/studentlogin";	
	}
	
	@GetMapping("/studentlogin")
	public String studentLogin(Model model) {
		model.addAttribute("studentlogin", new StudentLogin());
		return "studentlogin";
		
	}
	@PostMapping("/studentloginstatus")
	public String getloginStatus(@Valid @ModelAttribute("studentlogin")StudentLogin studentlogin, BindingResult br, Model model) {
		if(br.hasErrors()) {
			return "studentlogin";
		}
		
		List<Student>dbStudent= studentServises.studentList();
		boolean found= false;
		for(Student std: dbStudent) {
			if(std.getUsername().equals(studentlogin.getUsername()) && std.getPassword().equals(studentlogin.getPassword())) {
				found=true;
				break;
			}
		}
		if(found==true) {
			return"studentdashboard";
		}else {
			model.addAttribute("error", "Incorrect username or password");
			return "studentlogin";
		}
	
		
	}
	
}
