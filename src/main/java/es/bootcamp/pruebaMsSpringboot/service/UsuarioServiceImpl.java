package es.bootcamp.pruebaMsSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.bootcamp.pruebaMsSpringboot.model.User;
import es.bootcamp.pruebaMsSpringboot.repository.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepositorio userRepository;

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User findUserById(Integer id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User save(User user) {
		user.setName(user.getName());
		return userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {		
		return userRepository.save(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User findUserById(int id) {
		Optional<User> usuario = userRepository.findById(id);
		return usuario.get();
	}

	@Override
	public User save(User user) {
		userRepository.save(user);
		return user;
	}
	
	
	public User updateUserById(User user) {
		return userRepository.save(user);
	}

*/
}
