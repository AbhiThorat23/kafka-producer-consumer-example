package com.abhijit.springkafkaproducerexample.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhijit.springkafkaproducerexample.model.User;
import com.abhijit.springkafkaproducerexample.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, path = "/member")
	public ResponseEntity<User> register(@RequestBody User input) {
		User result = userService.registerUser(input);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
