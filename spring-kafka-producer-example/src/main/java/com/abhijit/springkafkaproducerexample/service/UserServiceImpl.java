package com.abhijit.springkafkaproducerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhijit.springkafkaproducerexample.model.User;
import com.abhijit.springkafkaproducerexample.producer.UserCreatedProducer;
import com.abhijit.springkafkaproducerexample.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserCreatedProducer userCreatedProducer;
	
	@Override
	public User registerUser(User user) {
		User createdUser = userRepository.save(user);
		userCreatedProducer.sendMessage(user);
		return createdUser;
	}

}
