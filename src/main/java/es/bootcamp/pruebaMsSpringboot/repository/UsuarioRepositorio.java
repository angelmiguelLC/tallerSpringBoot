package es.bootcamp.pruebaMsSpringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.bootcamp.pruebaMsSpringboot.model.User;

@Repository
public interface UsuarioRepositorio extends JpaRepository<User, Integer> {
	
	public List<User> findAll();
	
	public User findUserById(Integer id);
	
	public User save(User user);
	
	public void delete(User user);
	
}
