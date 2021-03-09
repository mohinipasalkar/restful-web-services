package com.mohini.selfstudy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

		//GET
		//URI - /hello-world
		//method return - "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path ="hello-world")
	@GetMapping(path= "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path= "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/path-variable/mohini
	@GetMapping(path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathParam(@PathVariable String name) {
		return new HelloWorldBean("Hello World "+name);
	}
	
}
