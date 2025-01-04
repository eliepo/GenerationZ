package com.GenerationZ.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.GenerationZ.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
