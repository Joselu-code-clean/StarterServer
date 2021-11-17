package com.example.StarterServer.state;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(State.class)
@EnableConfigurationProperties(StateProperties.class)
public class StateAutoconfigure {

	private final StateProperties properties;

	public StateAutoconfigure(StateProperties properties) {
		super();
		this.properties = properties;
	}
	
	
	/*Sin probar, aun no se si estoy bien encaminado...*/
	
	@Bean
	public String obtenerEstado() {
		return properties.getEstado();
	}
	
	@Bean
	public int obtenerIntentos() {
		return properties.getRetry();
	}
	
}
