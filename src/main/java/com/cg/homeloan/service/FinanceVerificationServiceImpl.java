package com.cg.homeloan.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class FinanceVerificationServiceImpl implements IFinanceVerificationService{
	@Autowired
    private ILoanApplicationRepository fApplicationRepository;
	@Override
	@Transactional
	public LoanApplication updateStatus(LoanApplication loanApplication) {
		Optional<LoanApplication> optional = fApplicationRepository.findById(loanApplication.getApplicationId());
        if (optional.isPresent()) {
            fApplicationRepository.save(loanApplication);
        }
		return loanApplication;
	}

}

