package com.zonaro.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zonaro.mongo.domain.User;
import com.zonaro.mongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo; // spring com a anotação ja estancia automaticamente
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}

}
