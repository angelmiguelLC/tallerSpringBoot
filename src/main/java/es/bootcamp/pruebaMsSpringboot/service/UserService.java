package es.bootcamp.pruebaMsSpringboot.service;

import java.util.List;

import es.bootcamp.pruebaMsSpringboot.model.User;

public interface UserService {

	public List<User> findAll();
	public User findUserById(int id);
	public User save(User user);
	public User delete(User user);
	public User updateUserById(User user);
	
	//public User updateUser(User user);
}
