package com.abhijit.springkafkaproducerexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class KafkaConfiguration {
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;
	
	@Value("${spring.kafka.topic.userCreated}")
	private String userCreatedTopic;

}
