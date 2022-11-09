package ar.edu.unlam.ar;

import java.util.Date;

public class Accion implements Comparable<Accion>{
	
	private Integer id;
	private Alarma alarma;
	private Usuario usuario;
	private Date fecha;
	private TipoDeOperacion tipo;
	
	public Accion(Integer id, Alarma alarma, Usuario usuario, Date fecha, TipoDeOperacion tipo) {
		super();
		this.id = id;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alarma getAlarma() {
		return alarma;
	}

	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoDeOperacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeOperacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Accion o) {
		return this.id.compareTo(o.getId());
	}
	
	
	
}
