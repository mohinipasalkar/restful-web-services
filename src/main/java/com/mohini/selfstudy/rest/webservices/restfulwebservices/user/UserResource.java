package com.mohini.selfstudy.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	//retriveAllUsers
	//retriveUser(int id)
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
		return service.findOne(id);  
	}
	
	//input - details of user
	// output - CREATED and return the created URI
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		//CREATED
		//URI would be /users/{id} savedUser.getId()
	URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
}
