package com.cg.homeloan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entitites.LoanApplication;

@Repository
public interface ILoanApplicationRepository extends JpaRepository<LoanApplication, Long>{
	/*public long deleteLoanApplication(long loanApplicationId);
	public List<LoanApplication> retrieveAllLoanApplication(long loanApplicationId);
	public LoanApplication retrieveLoanApplication(long loanApplicationId);
	public LoanApplication addLoanApplication(LoanApplication loanApplication);
	public LoanApplication updateLoanApplication(LoanApplication loanApplication);
	*/
}
