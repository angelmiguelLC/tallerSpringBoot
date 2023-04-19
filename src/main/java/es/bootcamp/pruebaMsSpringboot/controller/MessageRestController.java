package es.bootcamp.pruebaMsSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import es.bootcamp.pruebaMsSpringboot.service.MessageService;

@RestController
@RequestMapping(value="/api/v1")
public class MessageRestController {

	@Autowired
	private MessageService messageService;
	
	/*@Value("${course.message}")
	private String message;*/
	
	/*
	@GetMapping(value="/message")
	public String saludo() {
		return message;
	}
	*/
	
	@GetMapping(value="/messages")
	public String saludoInterfaz() {
		return messageService.getMessage();
	}
	
					
}
