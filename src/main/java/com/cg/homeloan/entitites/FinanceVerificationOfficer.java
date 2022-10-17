package com.cg.homeloan.entitites;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class FinanceVerificationOfficer extends User{
	@NotEmpty(message="Name cannot be empty")
	private String finOfficerName;
	@NotEmpty(message="Please enter mobile number")
	private String finOfficerContact;
	
	
	
	public FinanceVerificationOfficer() {
		
	}



	public FinanceVerificationOfficer(String finOfficerName, String finOfficerContact) {
		this.finOfficerName = finOfficerName;
		this.finOfficerContact = finOfficerContact;
	}





	public String getFinOfficerName() {
		return finOfficerName;
	}



	public void setFinOfficerName(String finOfficerName) {
		this.finOfficerName = finOfficerName;
	}



	public String getFinOfficerContact() {
		return finOfficerContact;
	}



	public void setFinOfficerContact(String finOfficerContact) {
		this.finOfficerContact = finOfficerContact;
	}
	
	
}
