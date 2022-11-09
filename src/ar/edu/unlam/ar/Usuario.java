package ar.edu.unlam.ar;

public class Usuario {

	private Integer dni;
	private String nombre;
	
	public Usuario(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
