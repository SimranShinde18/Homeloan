package com.cg.homeloan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entitites.LoanAgreement;

@Repository
public interface ILoanAgreementRepository extends JpaRepository<LoanAgreement, Long>{
	/*public long deleteLoanAgreement(long loanAgreementId);
	public List<LoanAgreement> retrieveAllLoanAgreement(long loanAgreementId);
	public LoanAgreement retrieveLoanAgreement(long loanAgreementId);
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement);
	public LoanAgreement updateLoanAgreement(LoanAgreement loanAgreement);
	*/
}
