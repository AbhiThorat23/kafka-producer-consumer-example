package com.codelabs.springkafkaconsumerexample.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.abhijit.springkafkaproducerexample.model.User;

@Service
public class UserCreatedListner {
	@KafkaListener(topics = "${spring.kafka.topic.userCreated}", containerFactory = "userKafkaListenerContainerFactory")
	public void userListner(User user) {
	    System.out.println("Received Messasge in group foo: " + user);
	}
}
