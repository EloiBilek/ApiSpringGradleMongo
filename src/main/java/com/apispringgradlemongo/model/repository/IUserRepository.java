package com.apispringgradlemongo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apispringgradlemongo.model.entity.User;

/**
 * @author eloi eloibilek@gmail.com
 */
public interface IUserRepository extends MongoRepository<User, String> {
}
