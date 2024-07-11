package com.registraion.studentregistration.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class StudentLogin {

	@Id
	private int id;
	
	@NotBlank(message = "Username cannot be empty")
	private String username;
	
	@NotBlank(message = "Password cannot be empty")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentLogin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentLogin [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
