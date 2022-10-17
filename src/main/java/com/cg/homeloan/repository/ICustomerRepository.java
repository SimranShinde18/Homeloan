package com.cg.homeloan.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.LoanApplication;

@Repository
public interface ICustomerRepository  extends JpaRepository<Customer, Integer>{
	//public Customer viewCustomer(int custid);
	//public List<Customer> viewAllCustomers();
	//public Customer addCustomer(Customer customer);
	//public Customer updateCustomer(Customer customer);
	//public Customer deleteCustomer(Customer customer);
	//public List<Customer> viewCustomerList(LocalDate dateOfApplication);
	
}
