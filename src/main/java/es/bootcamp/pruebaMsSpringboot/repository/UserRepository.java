package es.bootcamp.pruebaMsSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.bootcamp.pruebaMsSpringboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findUserById(Integer id);
	
	public User save(User user);
	
	public void delete(User user);
	
	

}
