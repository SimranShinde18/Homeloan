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

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.service.ILoanApplicationService;

@RestController
@RequestMapping("/loanApplication")
public class ApplicationController {
	@Autowired
	private ILoanApplicationService applicationService;
	
	@GetMapping(value="/{loanApplicationId}", produces= {"application/json","application/xml"})
	public ResponseEntity<LoanApplication> getLoanApplicationById(@PathVariable long loanApplicationId){
		LoanApplication loanApplication = applicationService.retrieveLoanApplication(loanApplicationId);
		return new ResponseEntity<LoanApplication>(loanApplication, HttpStatus.OK);
	}
	
	@GetMapping(value = "/applications", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<List<LoanApplication>> readAllLoanApplications(){
		List<LoanApplication> applicationList = applicationService.retrieveAllLoanApplication();
		return new ResponseEntity<List<LoanApplication>>(applicationList, HttpStatus.OK);
	}
	
	@PostMapping(value = "/{userId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<LoanApplication> addLoanApplication(@RequestBody LoanApplication loanApplication ){
		return new ResponseEntity<LoanApplication>(applicationService.addLoanApplication(loanApplication), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{loanApplicationId}", produces = {"application/json","application/xml"})
	public ResponseEntity<LoanApplication> deleteLoanApplication(@PathVariable long loanApplicationId){
		LoanApplication loanApplication = applicationService.deleteLoanApplication(loanApplicationId);
		return new ResponseEntity<LoanApplication>(loanApplication, HttpStatus.OK);
	}

	@PutMapping(value="/{loanapplicationId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	public ResponseEntity<LoanApplication> updateLoanApplication(@RequestBody LoanApplication loanApplication){
		return new ResponseEntity<>(applicationService.updateLoanApplication(loanApplication), HttpStatus.OK);
	}
	
}
