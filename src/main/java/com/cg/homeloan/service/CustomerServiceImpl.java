package com.cg.homeloan.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.LoanAgreement;
import com.cg.homeloan.entitites.LoanApplication;
import com.cg.homeloan.repository.ICustomerRepository;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Component
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerRepository customerRepository;
	@Autowired
	private ILoanApplicationRepository applicationRepository;
	
	@Transactional
	@Override
	public Customer addCustomer(Customer c) {
		Customer cust=customerRepository.save(c);
		return cust;
	}
	
	
	@Override
	public Customer viewCustomer(int custid) {
		Optional<Customer> customer=customerRepository.findById(custid);
		if(customer.isPresent())
			return customer.get();
		return null;
	}

	@Override
	public List<Customer> viewAllCustomers() {
		List<Customer> custList= new ArrayList<>();
		Iterable<Customer> customers= customerRepository.findAll();
		customers.forEach(c->custList.add(c));
		return custList;
	}
	
	@Transactional
	@Override
	public Customer updateCustomer(Customer customer) {
		int id = customer.getUserId();
		Customer prevCustomer = viewCustomer(id);
		prevCustomer.setAadharNumber(customer.getAadharNumber());
		prevCustomer.setCustomerName(customer.getCustomerName());
		prevCustomer.setDateOfBirth(customer.getDateOfBirth());
		prevCustomer.setEmailId(customer.getEmailId());
		prevCustomer.setGender(customer.getGender());
		prevCustomer.setLoanApplication(customer.getLoanApplicationList());
		prevCustomer.setMobileNumber(customer.getMobileNumber());
		prevCustomer.setNationality(customer.getNationality());
		prevCustomer.setPanNumber(customer.getPanNumber());
		prevCustomer.setPassword(customer.getPassword());
		prevCustomer.setRole(customer.getRole());
		return prevCustomer;
	}
	
	@Transactional
	@Override
	public Customer deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
		return customer;
	}

	@Override
	public List<Customer> viewCustomerList(LocalDate dateOfApplication) {
		List<Customer> customerList = new ArrayList<>();
		List<LoanApplication> allApplications = null;
		try {
			allApplications = (List<LoanApplication>) applicationRepository.findAll();
			for (LoanApplication la : allApplications) {
				Long applicationId = la.getApplicationId();

				Optional<LoanApplication> optional = applicationRepository.findById(applicationId);

				if (optional.isPresent() && optional.get().getApplicationDate().equals(dateOfApplication)) {

					customerList.add(optional.get().getCustomer());

				}
			}

		} 
		catch (Exception e) {
			
		}

		return customerList;
		//return null;
		
	}

}
