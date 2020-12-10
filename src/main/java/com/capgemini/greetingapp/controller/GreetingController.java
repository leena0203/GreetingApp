package com.capgemini.greetingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.greetingapp.model.Greeting;
import com.capgemini.greetingapp.model.User;
import com.capgemini.greetingapp.service.IGreetingInterface;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	@Autowired
	private IGreetingInterface greetingService;

	@GetMapping(value = { "", "/", "/home" })
	public Greeting greeting(@RequestParam(value = "fname", defaultValue = "World") String fname,
			@RequestParam(value = "lname", defaultValue = "World") String lname) {
		User user = new User();
		user.setFirstName(fname);
		user.setLastName(lname);
		return greetingService.addGreeting(user);
	}

	@RequestMapping("/id")
	public Greeting getId(@RequestParam(value = "id") long id) {
		return greetingService.getGreetingById(id);
	}

	@RequestMapping("/getall")
	public List<Greeting> getAll() {
		return greetingService.getAll();
	}

	@RequestMapping("/update")
	public Greeting updateGreeting(@RequestParam(value = "id") long id,
			@RequestParam(value = "fname", defaultValue = "World") String fname,
			@RequestParam(value = "lname", defaultValue = "World") String lname) {
		User user = new User();
		user.setFirstName(fname);
		user.setLastName(lname);
		return greetingService.updateGreeting(id, user);
	}

	@RequestMapping("/delete")
	public List<Greeting> deleteGreeting(@RequestParam(value = "id") long id) {
		return greetingService.deleteGreeting(id);
	}
}