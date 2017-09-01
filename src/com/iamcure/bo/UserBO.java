package com.iamcure.bo;

import java.util.Calendar;

public class UserBO {
	
	private int id;
	
	private String fullName;
	
	private String phoneNumber;
	
	private String email;
	
	private String password;
	
	private Calendar createdDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", password=" + password
				+ ", createdDate=" + createdDate + "]";
	}
	
	

}
