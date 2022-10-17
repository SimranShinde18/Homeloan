package com.cg.homeloan.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.homeloan.entitites.Customer;

public interface ICustomerService {
	public Customer viewCustomer(int custid);
	public List<Customer> viewAllCustomers();
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(Customer customer);
	public List<Customer> viewCustomerList(LocalDate dateOfApplication);
	
}
