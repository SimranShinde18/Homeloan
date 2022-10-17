package com.cg.homeloan.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class AdminVerificationServiceImpl implements IAdminVerificationService{
	@Autowired
    private ILoanApplicationRepository adApplicationRepository;
	@Override
	@Transactional
	public LoanApplication updateStatus(LoanApplication loanApplication) {
		Optional<LoanApplication> optional = adApplicationRepository.findById(loanApplication.getApplicationId());
        if (optional.isPresent()) {
            adApplicationRepository.save(loanApplication);
        }
		return loanApplication;
	}

}