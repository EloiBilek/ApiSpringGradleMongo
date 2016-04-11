package com.apispringgradlemongo.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apispringgradlemongo.model.entity.User;

/**
 * @author eloi eloibilek@gmail.com
 */
public interface IUserRepository extends MongoRepository<User, String> {

	List<User> findByName(String name);

	List<User> findByEmail(String email);

}
