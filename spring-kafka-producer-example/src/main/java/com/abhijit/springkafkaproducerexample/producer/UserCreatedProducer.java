package com.abhijit.springkafkaproducerexample.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.abhijit.springkafkaproducerexample.config.KafkaConfiguration;
import com.abhijit.springkafkaproducerexample.model.User;

@Component
public class UserCreatedProducer {
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	@Autowired
	private KafkaConfiguration kafkaConfig;

	public void sendMessage(User message) {
		
		  ListenableFuture<SendResult<String, User>> future =
		  kafkaTemplate.send(kafkaConfig.getUserCreatedTopic(), message);
		  
		  future.addCallback(new ListenableFutureCallback<SendResult<String, User>>() {
		  
		  @Override public void onFailure(Throwable ex) {
		  System.out.println("Unable to send message=[" + message + "] due to : " +
		  ex.getMessage()); }
		  
		  @Override public void onSuccess(SendResult<String, User> result) {
		  System.out.println( "Sent message=[" + message + "] with offset=[" +
		  result.getRecordMetadata().offset() + "]");
		  
		  } });
		 
		 //kafkaTemplate.send(kafkaConfig.getUserCreatedTopic(), message);
	}
}
