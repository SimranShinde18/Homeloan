package com.cg.homeloan.entitites;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity

public class LoanAgreement {
	@Id
	private long loanAgreementId;
	@NotEmpty(message="Application ID cannot be empty")
	private long loanApplicationId;
	@OneToOne(mappedBy="loanAgreement")
	private EMI emi;
	
	public LoanAgreement() {
		super();
	}
	public LoanAgreement(long loanAgreementId, long loanApplicationId, EMI emi) {
		super();
		this.loanAgreementId = loanAgreementId;
		this.loanApplicationId = loanApplicationId;
		this.emi = emi;
	}
	public long getLoanAgreementId() {
		return loanAgreementId;
	}
	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}
	public long getLoanApplicationId() {
		return loanApplicationId;
	}
	public void setLoanApplicationId(long loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}
	public EMI getEmi() {
		return emi;
	}
	public void setEmi(EMI emi) {
		this.emi = emi;
	}
	

}
