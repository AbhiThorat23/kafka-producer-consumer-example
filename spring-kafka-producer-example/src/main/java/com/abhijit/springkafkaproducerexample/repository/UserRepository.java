package com.abhijit.springkafkaproducerexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhijit.springkafkaproducerexample.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
