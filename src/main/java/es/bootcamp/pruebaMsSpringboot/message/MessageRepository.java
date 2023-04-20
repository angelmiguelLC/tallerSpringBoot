package es.bootcamp.pruebaMsSpringboot.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageRepository implements MessageService {
	
	@Autowired
	@Value("${course.message:${course.defaultMessage}}")
	private String message;

	@Override
	public String getMessage() {
		return message;
	}
}
