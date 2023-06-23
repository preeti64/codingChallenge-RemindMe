package com.codingchallenge.springrestadminservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.springrestadminservice.dao.UserDao;
import com.codingchallenge.springrestadminservice.entities.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Users> getAllUsers() {
		return userDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Users findById(long id) {
		return userDao.getById(id);
	}

	@Override
	public Users addUser(Users user) {
		userDao.save(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {
		userDao.save(user);
		return user;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteUser(long id) {
		Users entity = userDao.getById(id);
		userDao.delete(entity);
		
	}
	

}
