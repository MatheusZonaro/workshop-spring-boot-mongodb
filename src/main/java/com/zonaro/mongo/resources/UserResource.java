package com.zonaro.mongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zonaro.mongo.domain.User;
import com.zonaro.mongo.dto.UserDTO;
import com.zonaro.mongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET) // poderia ser tbm, requestmapping // Vai ser um get, pesquisa, obter info no padrao rest
	public ResponseEntity<List<UserDTO>> findAll(){
		


		List<User> list = service.findAll();
		
		
		// Aqui eu pego o retorno da lista e com expressao lambda tranformo em listDto só com o que preciso
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		
		return ResponseEntity.ok().body(listDto);
	}

}
