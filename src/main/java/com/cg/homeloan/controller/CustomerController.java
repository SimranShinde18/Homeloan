package com.cg.homeloan.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.User;
import com.cg.homeloan.repository.IUserRepository;
import com.cg.homeloan.service.ICustomerService;
import com.cg.homeloan.service.IUserService;

@RestController
@RequestMapping("/homeloan")
public class CustomerController {
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ICustomerService customerService;
	
	 @PostMapping(produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	 	public ResponseEntity<User> addUser(@RequestBody User user){
		 	return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.OK);
	 	}
	 
	 @PostMapping(value = "/customer",produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
	 	public ResponseEntity<Customer> addCustomer( @RequestBody Customer c) {
	 		return new ResponseEntity<>(customerService.addCustomer(c), HttpStatus.OK);
	 	}
		
	 @DeleteMapping(value = "/{custId}",  produces = {"application/json","application/xml"})
		public ResponseEntity<Customer> deleteCustomer(@PathVariable("custId") Customer c) {
			Customer cust = customerService.deleteCustomer(c);
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		}
	 
	 @GetMapping(value = "/{custId}",  produces = {"application/json","application/xml"})
		public ResponseEntity<Customer> getCustomerById(@PathVariable("custId")  int cid) {
			Customer cust = customerService.viewCustomer(cid);
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		}
	 
	 @GetMapping(value = "/customers",produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
		public ResponseEntity<List<Customer>> readAllCustomers() {
			List<Customer> clist = customerService.viewAllCustomers();
			return new ResponseEntity<List<Customer>>(clist, HttpStatus.OK);
		}
	 
	 @GetMapping(value = "/search/{applicationDate}",  produces = {"application/json","application/xml"})
	 ResponseEntity<List<Customer>> searchByApplicationDate(@RequestParam("applicationDate") @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate applicationDate){
			List<Customer> customers=customerService.viewCustomerList(applicationDate);
			//return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
			return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	 
	 
	 @PutMapping(value = "/{custId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
		public ResponseEntity<Customer> updateCustomer(@RequestBody Customer c) {
			return new ResponseEntity<>(customerService.updateCustomer(c), HttpStatus.OK);
		}
	 
	 //-------------- value = "/{custId}" --------
	 // Change the method
	/* @PutMapping(value = "/{custId}", produces = {"application/json","application/xml"},consumes =  {"application/json","application/xml"})
		public ResponseEntity<Customer> updateCustomer(@RequestBody Customer c) {
			return new ResponseEntity<>(customerService.updateCustomer(c), HttpStatus.OK);
		}

		@GetMapping(value = "/search/applicationDate",  produces = {"application/json","application/xml"})
		ResponseEntity<List<Customer>> searchByCustomerType(@RequestParam("applicationDate") LocalDate applicationDate){
				//List<Customer> customers=customerService.viewCustomerList(applicationDate);
				//return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
			return null;
		}
	 */
}
