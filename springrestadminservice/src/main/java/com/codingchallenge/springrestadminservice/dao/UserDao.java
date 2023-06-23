package com.codingchallenge.springrestadminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingchallenge.springrestadminservice.entities.Users;

public interface UserDao extends JpaRepository<Users, Long>  {

}
