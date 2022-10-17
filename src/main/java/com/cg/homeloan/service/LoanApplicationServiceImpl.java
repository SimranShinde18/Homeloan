package com.cg.homeloan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Component
public class LoanApplicationServiceImpl implements ILoanApplicationService{
	
	@Autowired
	private ILoanApplicationRepository applicationRepository;
	
	@Transactional
	@Override
	public LoanApplication deleteLoanApplication(long loanApplicationId) {
		Optional<LoanApplication> loanApplicationOptional = applicationRepository.findById(loanApplicationId);
		try {
			LoanApplication loanApplication = loanApplicationOptional.get();
			applicationRepository.delete(loanApplication);
			return loanApplication;
		}
		catch(Exception e){
			
		}
		return null;
		
	}

	@Override
	public List<LoanApplication> retrieveAllLoanApplication() {
		List<LoanApplication> applicationList = new ArrayList<>();
		List<LoanApplication> applications = applicationRepository.findAll();
		applications.forEach(a->applicationList.add(a));
		return applications;
		//return applicationRepository.findAll();
	}

	@Override
	public LoanApplication retrieveLoanApplication(long loanApplicationId) {
		Optional<LoanApplication> loanApplicationOptional = applicationRepository.findById(loanApplicationId);
		try {
			LoanApplication loanApplication = loanApplicationOptional.get();
			return loanApplication;
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	@Transactional
	@Override
	public LoanApplication addLoanApplication(LoanApplication loanApplication) {
		LoanApplication application = applicationRepository.save(loanApplication);
		return application;
	}
	
	@Transactional
	@Override
	public LoanApplication updateLoanApplication(LoanApplication loanApplication) {
		long id = loanApplication.getApplicationId();
		Optional<LoanApplication> prevApplication = applicationRepository.findById(id);
		if(prevApplication.isPresent()) {
			applicationRepository.save(loanApplication);
			return loanApplication;
		}
		else {
			
		}
		return null;
	}

}
