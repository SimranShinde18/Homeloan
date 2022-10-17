package com.cg.homeloan.entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Admin extends User{
	@NotEmpty(message="User name cannot be empty")
	private String adminName;
	@NotEmpty(message="Please enter mobile number")
	@Column(length=20)
	private String adminContact;
	
	public Admin() {

	}

	public Admin(String adminName, String adminContact) {
		this.adminName = adminName;
		this.adminContact = adminContact;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	
	
}
