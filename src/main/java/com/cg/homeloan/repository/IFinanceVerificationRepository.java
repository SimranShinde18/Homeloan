package com.cg.homeloan.repository;

import com.cg.homeloan.entitites.LoanApplication;

public interface IFinanceVerificationRepository {
	public void updatestatus(LoanApplication loanApplication);
}
