package com.registraion.studentregistration.module;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "First name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed")
    @Size(min = 2, max = 12, message = "First name should have 2 to 12 letters")
    private String firstname;

    @NotBlank(message = "Last name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed")
    @Size(min = 2, max = 12, message = "Last name should have 2 to 12 letters")
    private String lastname;

    @NotBlank(message = "College name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed")
    private String collegename;

    @NotBlank(message = "Branch name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed")
    private String branch;

  
    private Date birthdate;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$", 
             message = "Password must have at least one uppercase letter, one number, one special character (@#$%^&+=!), and be at least 8 characters long")
    private String password;
    
    @NotBlank(message = "Phone number cannot be empty")
    @Pattern(regexp = "^[7-9][0-9]{9}$", message = "Phone number must be exactly 10 digits and start with a digit between 7 and 9")
    private String phonenumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", collegename="
				+ collegename + ", branch=" + branch + ", birthdate=" + birthdate + ", email=" + email + ", username="
				+ username + ", password=" + password + ", phonenumber=" + phonenumber + "]";
	}

	public Student(int id,
			@NotBlank(message = "First name cannot be empty") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed") @Size(min = 2, max = 12, message = "First name should have 2 to 12 letters") String firstname,
			@NotBlank(message = "Last name cannot be empty") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed") @Size(min = 2, max = 12, message = "Last name should have 2 to 12 letters") String lastname,
			@NotBlank(message = "College name cannot be empty") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed") String collegename,
			@NotBlank(message = "Branch name cannot be empty") @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only letters and spaces allowed") String branch,
			Date birthdate,
			@NotBlank(message = "Email cannot be empty") @Email(message = "Invalid email format") String email,
			@NotBlank(message = "Username cannot be empty") String username,
			@NotBlank(message = "Password cannot be empty") @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$", message = "Password must have at least one uppercase letter, one number, one special character (@#$%^&+=!), and be at least 8 characters long") String password,
			String phonenumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.collegename = collegename;
		this.branch = branch;
		this.birthdate = birthdate;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

}