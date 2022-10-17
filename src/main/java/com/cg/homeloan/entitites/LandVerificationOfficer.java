package com.cg.homeloan.entitites;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class LandVerificationOfficer extends User{
	@NotEmpty(message="Land Verification officer name cannot be empty")
	private String officerName;
	@NotEmpty(message="Please enter mobile number")
	private String officerContact;
	
	public LandVerificationOfficer() {
	}

	public LandVerificationOfficer(String officerName, String officerContact) {
		
		this.officerName = officerName;
		this.officerContact = officerContact;
	}

	
	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerContact() {
		return officerContact;
	}

	public void setOfficerContact(String officerContact) {
		this.officerContact = officerContact;
	}
	
	

}
