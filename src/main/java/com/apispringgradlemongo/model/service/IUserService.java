package com.apispringgradlemongo.model.service;

import java.util.List;

import com.apispringgradlemongo.model.entity.User;

/**
 * @author eloi eloibilek@gmail.com
 */
public interface IUserService extends IOperations<User> {

	List<User> findByName(String name);

	List<User> findByEmail(String email);

}
