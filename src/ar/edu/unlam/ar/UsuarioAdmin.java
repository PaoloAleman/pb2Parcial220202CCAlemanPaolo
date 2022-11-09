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
	
	public boolean agregarUnSensorAUnaAlarma(Sensor sensor, Alarma alarma) throws SensorDuplicadoException {
		if(alarma.getSensores().contains(sensor)==false) {
			return alarma.getSensores().add(sensor);
		}
		throw new SensorDuplicadoException("Ese sensor ya existe");
	}
	
	public void activarSensorDeAlarma(Alarma alarma, Sensor sensor, String codigoDeConfig) {
		if(alarma.getSensores().contains(sensor) && alarma.getCodigoDeConfig().equals(codigoDeConfig)) {
			sensor.setEstado(true);
		}
	}
	
	public void recorrerSensores(Alarma alarma, UsuarioActivador usuario) {
		for (Sensor a : alarma.sensores) {
			if(a.getEstado() || alarma.sensores.isEmpty()==false) {
				
			}
		}
	}
	
	

}
