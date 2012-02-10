package org.yankun.lms.entity;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class User {
	private int id;
	
	@NotEmpty(message = "username must not be blank.")
	@Size(min = 1, max = 20)
	private String username;
	
	
	private String email;
	
	@NotEmpty
    @Size(min = 1, max = 10)
	private String password;
	private String passwordQuestion;
	private String passwordAnwser;
	private Date registerDate;
	private boolean status;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordQuestion() {
		return passwordQuestion;
	}
	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}
	public String getPasswordAnwser() {
		return passwordAnwser;
	}
	public void setPasswordAnwser(String passwordAnwser) {
		this.passwordAnwser = passwordAnwser;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
