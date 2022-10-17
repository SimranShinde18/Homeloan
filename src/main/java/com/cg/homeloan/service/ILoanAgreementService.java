package com.cg.homeloan.service;

import java.util.List;

import com.cg.homeloan.entitites.LoanAgreement;

public interface ILoanAgreementService {
	public LoanAgreement deleteLoanAgreement(long loanAgreementId);
	public List<LoanAgreement> retrieveAllLoanAgreement();
	public LoanAgreement retrieveLoanAgreement(long loanAgreementId);
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement);
	public LoanAgreement updateLoanAgreement(LoanAgreement loanAgreement);
}
