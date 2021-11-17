package com.example.StarterServer.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterClient.CircuitBreaker;

@Component
@Endpoint(id = "state")
@RestController
public class EndPointState {
	
	@Autowired
	CircuitBreaker circuitBreaker;
	
	// Para comprobar que funciona cada intento.
	private Integer retry = 0;
	
	@ReadOperation
	public String changeStatus() {
		retry++;
		System.out.println("Intento:---"+retry);
		return circuitBreaker.changeStatus();
	}
}
