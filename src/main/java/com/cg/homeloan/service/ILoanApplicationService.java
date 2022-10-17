package com.cg.homeloan.service;

import java.util.List;


import com.cg.homeloan.entitites.LoanApplication;

public interface ILoanApplicationService {
	public LoanApplication deleteLoanApplication(long loanApplicationId);
	public List<LoanApplication> retrieveAllLoanApplication();
	public LoanApplication retrieveLoanApplication(long loanApplicationId);
	public LoanApplication addLoanApplication(LoanApplication loanApplication);
	public LoanApplication updateLoanApplication(LoanApplication loanApplication);
}
