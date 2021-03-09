package com.mohini.selfstudy.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eva", new Date()));
		users.add(new User(3, "Jackson", new Date()));
	}
	
	// Write methods which returning specific user, list of users and save the user
	//public List<User> findAll()
	//public User save(User user)
	//public User findOne(int id)
	
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == 0) {
			user.setId(userCount+1);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
