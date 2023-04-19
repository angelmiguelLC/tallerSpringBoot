package es.bootcamp.pruebaMsSpringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.bootcamp.pruebaMsSpringboot.model.User;
import es.bootcamp.pruebaMsSpringboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

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
		return null;
	}
	
	

	@Override
	public User delete(User user) {
		userRepository.delete(user);
		return null;
	}





}
