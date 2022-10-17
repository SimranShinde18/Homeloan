package com.cg.homeloan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.homeloan.entitites.LoanAgreement;
import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ILoanAgreementRepository;

@Component
public class LoanAgreementServiceImpl implements ILoanAgreementService{
	@Autowired
	private ILoanAgreementRepository agreementRepository;
	
	@Transactional
	@Override
	public LoanAgreement deleteLoanAgreement(long loanAgreementId) {
		Optional<LoanAgreement> loanAgreementOptional = agreementRepository.findById(loanAgreementId);
		try {
			LoanAgreement loanAgreement = loanAgreementOptional.get();
			agreementRepository.delete(loanAgreement);
			return loanAgreement;
		}
		catch(Exception e){
			
		}
		return null;
	}

	@Override
	public List<LoanAgreement> retrieveAllLoanAgreement() {
		List<LoanAgreement> agreementList = new ArrayList<>();
		List<LoanAgreement> agreements = agreementRepository.findAll();
		agreements.forEach(a->agreementList.add(a));
		return agreements;
	}

	@Override
	public LoanAgreement retrieveLoanAgreement(long loanAgreementId) {
		Optional<LoanAgreement> loanAgreementOptional = agreementRepository.findById(loanAgreementId);
		try {
			LoanAgreement loanAgreement = loanAgreementOptional.get();
			return loanAgreement;
		}
		catch(Exception e){
			
		}
		return null;
	}

	@Transactional
	@Override
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) {
		LoanAgreement agreement = agreementRepository.save(loanAgreement);
		return agreement;
	}
	
	@Transactional
	@Override
	public LoanAgreement updateLoanAgreement(LoanAgreement loanAgreement) {
		long id = loanAgreement.getLoanAgreementId();
		Optional<LoanAgreement> prevAgreement = agreementRepository.findById(id);
		if(prevAgreement.isPresent()) {
			agreementRepository.save(loanAgreement);
			return loanAgreement;
		}
		else {
			
		}
		return null;
	}

}
