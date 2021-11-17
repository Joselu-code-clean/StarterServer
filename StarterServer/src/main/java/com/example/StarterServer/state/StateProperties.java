package com.example.StarterServer.state;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("state.estado")
public class StateProperties {

	private String estado = "Close";
	
	private int retry = 0;
	
	public int getRetry() {
		return retry;
	}

	public void setRetry(int retry) {
		this.retry = retry;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
