package com.cg.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.service.IAdminVerificationService;

@RestController
@RequestMapping("/adminVerification")
public class AdminController {
	@Autowired
    private IAdminVerificationService adminVerificationService;
	
	@PutMapping(value = "/adminstatus",  produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
    public ResponseEntity<LoanApplication> updateStatus( @RequestBody LoanApplication loanApplication) {
		return new ResponseEntity<>(adminVerificationService.updateStatus(loanApplication), HttpStatus.OK);
    }
}
