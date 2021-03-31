package com.zonaro.mongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zonaro.mongo.domain.User;
import com.zonaro.mongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET) // poderia ser tbm, requestmapping // Vai ser um get, pesquisa, obter info no padrao rest
	public ResponseEntity<List<User>> findAll(){
		


		List<User> list = service.findAll();
		
		
		return ResponseEntity.ok().body(list);
	}

}
