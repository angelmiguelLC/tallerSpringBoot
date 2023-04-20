package es.bootcamp.pruebaMsSpringboot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.bootcamp.pruebaMsSpringboot.model.User;
import es.bootcamp.pruebaMsSpringboot.service.UsuarioServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserRestController {

	@Autowired
	private UsuarioServiceImpl userService;
	
	@GetMapping("usuarios")
	public ResponseEntity<?> getAll() {
		List<User> lista = userService.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("usuarios/nuevo")
	public ResponseEntity<?> newUser(@RequestBody User user) {
		User newUser = userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
	}
	
	
	@PutMapping("usuarios")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		User updateUser = userService.updateUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateUser);
	}
	
	@GetMapping("usuarios/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Integer id) {
		User findUser = userService.findUserById(id);
		return ResponseEntity.ok(findUser);
	}
	
	
	@DeleteMapping("usuarios/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id) {
		userService.delete(id);
		return ResponseEntity.ok().build();
	}
}
