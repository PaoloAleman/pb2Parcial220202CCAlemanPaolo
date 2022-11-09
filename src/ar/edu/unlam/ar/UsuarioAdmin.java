package ar.edu.unlam.ar;

public class UsuarioAdmin extends Usuario {

	Central central;
	
	public UsuarioAdmin(Integer dni, String nombre) {
		super(dni, nombre);
		central= new Central();
	}
	
	public boolean agregarAlarma(Alarma alarma) {
		return central.alarmas.add(alarma);
	}
	
	public boolean agregarUsuario(Usuario usuario) {
		if(usuario instanceof UsuarioConfig || usuario instanceof UsuarioActivador ) {
			return central.usuarios.add(usuario);
		}
		return false;
	}
	
	public boolean agregarUnUsuarioAUnaAlarma(Integer dniUsuario, String codigoConfigAlarma, Sensor sensor, Integer idUsuarioConfig) {
		
		return false;
	}

}
