package es.bootcamp.pruebaMsSpringboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.bootcamp.pruebaMsSpringboot.model.User;
import es.bootcamp.pruebaMsSpringboot.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> listado = new ArrayList<User>();
		listado = userService.findAll();
		
		return new ResponseEntity<>(listado, HttpStatus.OK);
	}
	
	@GetMapping("usuarios/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
		Optional<User> usuario = Optional.ofNullable(userService.findUserById(id));
		return new ResponseEntity<User>(usuario.get(), HttpStatus.OK);
	}
	

	@PostMapping("usuarios/{id}")
	public ResponseEntity<User> createUser(@PathVariable("id") User user){		
			userService.save(user);
			
			return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	
	@PutMapping(value= "usuarios/")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@DeleteMapping("/usuarios/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") int id){
		User usuario = userService.findUserById(id);
		userService.delete(usuario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@PutMapping(value = "usuarios/{id}")
	public ResponseEntity<User> updateUserByName(@PathVariable("id") int id, @RequestBody User user){
		Optional<User> usuario = userService.updateUser(id, user);
		
		return new ResponseEntity<User>(usuario.get(), HttpStatus.OK);
	}*/
}
