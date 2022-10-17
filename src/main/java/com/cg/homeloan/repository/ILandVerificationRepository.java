package com.cg.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.homeloan.entitites.LandVerificationOfficer;
import com.cg.homeloan.entitites.LoanApplication;

public interface ILandVerificationRepository extends JpaRepository<LandVerificationOfficer, Integer>{
	//public void updateStatus(LoanApplication loanApplication);
}
