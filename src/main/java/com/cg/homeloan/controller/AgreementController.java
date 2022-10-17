package com.cg.homeloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entitites.LoanAgreement;
import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.service.ILoanAgreementService;
import com.cg.homeloan.service.ILoanApplicationService;

@RestController
@RequestMapping("/loanAgreement")
public class AgreementController {
	@Autowired
	private ILoanAgreementService agreementService;
	
	@GetMapping(value="/{loanAgreementId}", produces= {"application/json","application/xml"})
	public ResponseEntity<LoanAgreement> getLoanAgreementById(@PathVariable long loanAgreementId){
		LoanAgreement loanAgreement = agreementService.retrieveLoanAgreement(loanAgreementId);
		return new ResponseEntity<LoanAgreement>(loanAgreement, HttpStatus.OK);
	}
	
	@GetMapping(value = "/agreements", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<List<LoanAgreement>> readAllLoanAgreements(){
		List<LoanAgreement> agreementList = agreementService.retrieveAllLoanAgreement();
		return new ResponseEntity<List<LoanAgreement>>(agreementList, HttpStatus.OK);
	}
	
	@PostMapping(value = "/{userId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<LoanAgreement> addLoanAgreement(@RequestBody LoanAgreement loanAgreement ){
		return new ResponseEntity<LoanAgreement>(agreementService.addLoanAgreement(loanAgreement), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{loanAgreementId}", produces = {"application/json","application/xml"})
	public ResponseEntity<LoanAgreement> deleteLoanAgreement(@PathVariable long loanAgreementId){
		LoanAgreement loanAgreement = agreementService.deleteLoanAgreement(loanAgreementId);
		return new ResponseEntity<LoanAgreement>(loanAgreement, HttpStatus.OK);
	}

	@PutMapping(value="/{loanAgreementId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<LoanAgreement> updateLoanAgreement(@RequestBody LoanAgreement loanAgreement){
		return new ResponseEntity<>(agreementService.updateLoanAgreement(loanAgreement), HttpStatus.OK);
	}

}
