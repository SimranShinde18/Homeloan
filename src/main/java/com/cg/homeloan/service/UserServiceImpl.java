package com.cg.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.User;
import com.cg.homeloan.repository.IUserRepository;

@Component
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserRepository userRepository;
	@Override
	public User addNewUser(User user) {
		//Customer cust=customerRepository.save(c);
		User u=userRepository.save(user);
		return u;
	}

	@Override
	public User signIn(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
