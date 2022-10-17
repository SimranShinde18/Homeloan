package com.cg.homeloan.entitites;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Customer extends User{
	
	@NotEmpty(message="Customer name cannot be empty")
	private String customerName;
	@NotEmpty(message="Please enter mobile number")
	private String mobileNumber;
	@NotEmpty(message="Please enter email ID")
	private String emailId;
	@NotNull(message="Please enter yor date of birth")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@NotEmpty(message = "Gender can not be empty")
	private String gender;
	@NotEmpty(message = "Please select yor nationality")
	private String nationality;
	@NotEmpty(message="Please enter your aadhar number")
	private String aadharNumber;
	@NotEmpty(message="Please enter pan number")
	private String panNumber;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="customer")
	@JsonManagedReference
	private List<LoanApplication> loanApplicationList;

	public Customer() {
	}
	public Customer(String customerName, String mobileNumber, String emailId, LocalDate dateOfBirth,
			String gender, String nationality, String aadharNumber, String panNumber) {
		
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
	}
	
	
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public List<LoanApplication> getLoanApplicationList() {
		return loanApplicationList;
	}
	public void setLoanApplication(List<LoanApplication> loanApplicationList) {
		this.loanApplicationList = loanApplicationList;
	}

	



}
