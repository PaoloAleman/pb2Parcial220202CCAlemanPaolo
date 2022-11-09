package ar.edu.unlam.ar;

import java.util.*;

public class Alarma {

	private Integer id;
	private Integer codigoDeAct;
	private String codigoDeConfig;
	private String nombre;
	ArrayList<Usuario> usuariosValidos;
	ArrayList<Accion> acciones;
	ArrayList<Sensor> sensores;
	
	public Alarma(Integer id, Integer codigoDeAct, String codigoDeConfig, String nombre) {
		super();
		this.id = id;
		this.codigoDeAct = codigoDeAct;
		this.codigoDeConfig = codigoDeConfig;
		this.nombre = nombre;
		this.usuariosValidos= new ArrayList();
		this.acciones= new ArrayList();
		this.sensores= new ArrayList();
	}

	public Alarma() {
		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoDeAct() {
		return codigoDeAct;
	}

	public void setCodigoDeAct(Integer codigoDeAct) {
		this.codigoDeAct = codigoDeAct;
	}

	public String getCodigoDeConfig() {
		return codigoDeConfig;
	}

	public void setCodigoDeConfig(String codigoDeConfig) {
		this.codigoDeConfig = codigoDeConfig;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuariosValidos() {
		return usuariosValidos;
	}

	public void setUsuariosValidos(ArrayList<Usuario> usuariosValidos) {
		this.usuariosValidos = usuariosValidos;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}
	
	
	
	
}
