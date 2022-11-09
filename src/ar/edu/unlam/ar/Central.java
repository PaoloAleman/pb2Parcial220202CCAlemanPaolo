package ar.edu.unlam.ar;

import java.util.*;

public class Central {

	private Map <Integer, Alarma> alarmas;
	private Map <Integer,Usuario> usuarios;
	
	public Central() {
		this.alarmas= new TreeMap();
		this.usuarios= new TreeMap();
	}

	public Map<Integer, Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(Map<Integer, Alarma> alarmas) {
		this.alarmas = alarmas;
	}

	public Map<Integer, Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Map<Integer, Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	
}
