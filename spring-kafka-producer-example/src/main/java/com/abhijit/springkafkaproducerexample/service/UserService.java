package com.abhijit.springkafkaproducerexample.service;

import org.springframework.stereotype.Service;

import com.abhijit.springkafkaproducerexample.model.User;

@Service
public interface UserService {
	User registerUser(User user);
}
