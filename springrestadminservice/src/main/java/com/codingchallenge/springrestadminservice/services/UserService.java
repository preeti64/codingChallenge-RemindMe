package com.codingchallenge.springrestadminservice.services;

import java.util.List;

import com.codingchallenge.springrestadminservice.entities.Users;

public interface UserService {
	
	public List<Users> getAllUsers();
	
	public Users findById(long id);

	public Users addUser(Users user);

	public Users updateUser(Users user);

	public void deleteUser(long id);


}
