package com.example.StarterServer.state;

public class State {
	
	private String estado;
	private int retry;
	
	public int getRetry() {
		return retry;
	}

	public State(String estado) {
		super();
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
	
	
	// Logica del circuitBreaker: Segun el estado que le pase el cliente retornamos su siguiente estado.
	public String checkCircuitBreaker(String param) {
		switch (param) {
		case "close":
			estado = "open";
			break;
		case "open":
			estado = "half-open";
			break;
		case "half-open":
			estado = "close";
			break;

		default:
			break;
		}
		
		return estado;
	}
	

}
