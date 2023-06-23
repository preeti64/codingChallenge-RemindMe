package com.codingchallenge.springrestadminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.springrestadminservice.entities.Users;
import com.codingchallenge.springrestadminservice.services.UserService;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @GetMapping("/users")
	    public List<Users> getAllUsers() {
	        return this.userService.getAllUsers();
	    }
 
	 @GetMapping("/users/{id}")
	    public Users getUserById(@PathVariable String id) {
	        return this.userService.findById(Long.parseLong(id));
	    }
	 
	 @PostMapping("/users")
	    public Users createUser(@RequestBody Users user) {
	        return this.userService.addUser(user);
	    }
	 
	 @PutMapping("/users")
	    public Users updateUser(@RequestBody Users user) {
	        return this.userService.updateUser(user);
	    }
	 
	 @DeleteMapping("/users/{id}")
	    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id) {
	        try{
	        	this.userService.deleteUser(Long.parseLong(id));
	        	return new ResponseEntity<>(HttpStatus.OK);
	        }catch(Exception e) {
	        	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	        
	    }
}
