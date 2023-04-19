package es.bootcamp.pruebaMsSpringboot.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import es.bootcamp.pruebaMsSpringboot.service.MessageService;

@Service
public class MessageRepository implements MessageService {
	@Value("${course.message:${course.defaultMessage}}")
	private String message;

	@Override
	public String getMessage() {
		return message;
	}
}
