package com.cg.homeloan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entitites.Customer;
import com.cg.homeloan.entitites.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{
	/*public User addNewUser(User user);
	public User signIn(User user);
	public User signOut(User user);
	*/
	
}
