package com.cg.homeloan.service;

import com.cg.homeloan.entitites.LoanApplication;

public interface IFinanceVerificationService {

	public LoanApplication updateStatus(LoanApplication loanApplication);
	
}
