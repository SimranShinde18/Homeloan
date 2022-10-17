package com.cg.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.service.IFinanceVerificationService;

@RestController
@RequestMapping("/financeVerification")
public class FinanceVerificationController {
	@Autowired
    private IFinanceVerificationService financeVerificationService;
	
	@PutMapping(value = "/financestatus",  produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
    public ResponseEntity<LoanApplication> updateStatus( @RequestBody LoanApplication loanApplication) {
		return new ResponseEntity<>(financeVerificationService.updateStatus(loanApplication), HttpStatus.OK);
    }
}
