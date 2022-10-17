package com.cg.homeloan.entitites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class EMI {
	@Id
	private long EMIId;
	@NotEmpty(message="Due date can not be empty")
	private LocalDate dueDate;
	@NotEmpty(message="EMI amount cannot be empty")
	private double emiAmount;
	@NotEmpty(message="Loan Amount cannot be empty")
	private double loanAmount;
	@NotEmpty(message="Interest cannot be empty")
	private double interestAmount;
	
	@OneToOne(optional=false)
	@JoinColumn(name = "loanAgreementId")
	private LoanAgreement loanAgreement;
	
	public EMI() {
		super();
	}

	public EMI(long eMIId, LocalDate dueDate, double emiAmount, double loanAmount, double interestAmount,
			LoanAgreement loanAgreement) {
		super();
		EMIId = eMIId;
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.loanAgreement = loanAgreement;
	}

	public long getEMIId() {
		return EMIId;
	}

	public void setEMIId(long eMIId) {
		EMIId = eMIId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public LoanAgreement getLoanAgreement() {
		return loanAgreement;
	}

	public void setLoanAgreement(LoanAgreement loanAgreement) {
		this.loanAgreement = loanAgreement;
	}

	

	
	
	

}
