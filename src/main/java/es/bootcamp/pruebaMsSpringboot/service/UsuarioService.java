package es.bootcamp.pruebaMsSpringboot.service;


import java.util.List;

import es.bootcamp.pruebaMsSpringboot.model.User;

public interface UsuarioService {

	public List<User> findAll();
	public User save(User user);
	public User findUserById(Integer id);
	public User updateUser(User user);
	public void delete(int id);
	

}
