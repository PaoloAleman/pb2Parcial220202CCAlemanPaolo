package ar.edu.unlam.ar;

public class UsuarioAdmin extends Usuario {
	
	public UsuarioAdmin(Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	public void agregarAlarma(Alarma alarma, Central central) {
		central.getAlarmas().put(alarma.getId(), alarma);
	}
	
	public void agregarUsuario(Usuario usuario, Central central) {
		if(usuario instanceof UsuarioConfig || usuario instanceof UsuarioActivador ) {
			central.getUsuarios().put(usuario.getDni(), usuario);
		}
	}
	
	public boolean agregarUnUsuarioAAlarma(Usuario usuario, Alarma alarma, String codigo) throws CodigoIncorrectoException {
		if(alarma.getCodigoDeConfig().equals(codigo)) {
			return alarma.getUsuariosValidos().add(usuario);
		}
		throw new CodigoIncorrectoException("El codigo es incorrecto");
	}
	
	public void agregarUnSensorAUnaAlarma(Sensor sensor, Alarma alarma) {
		
	}
	

	
	

}
