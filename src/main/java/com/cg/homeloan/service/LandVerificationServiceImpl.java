package com.cg.homeloan.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class LandVerificationServiceImpl implements ILandVerificationService{
	@Autowired
    private ILoanApplicationRepository applicationRepository;
	@Override
	@Transactional
	public LoanApplication updateStatus(LoanApplication loanApplication) {
		Optional<LoanApplication> optional = applicationRepository.findById(loanApplication.getApplicationId());
        if (optional.isPresent()) {
            applicationRepository.save(loanApplication);
        }
		return loanApplication;
	}

}
