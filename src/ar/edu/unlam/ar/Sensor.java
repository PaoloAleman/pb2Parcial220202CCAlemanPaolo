package ar.edu.unlam.ar;

public class Sensor {
	
	private Integer id;
	private Boolean estado;
	
	
	
	public Sensor(Integer id, Boolean estado) {
		this.id = id;
		this.estado = estado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
