package ar.edu.unlam.ar;

public class UsuarioAdmin extends Usuario {
	
	public UsuarioAdmin(Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	public boolean agregarAlarma(Alarma alarma, Central central) {
		return central.alarmas.add(alarma);
	}
	
	public void agregarUsuario(Usuario usuario, Central central) {
		if(usuario instanceof UsuarioConfig || usuario instanceof UsuarioActivador ) {
			central.usuarios.put(usuario.getDni(), usuario);
		}
	}
	
	public boolean agregarUnUsuarioAUnaAlarma(Integer dniUsuario, Integer idAlarma, String codigoConfigAlarma) {
		
		return false;
	}
	

	
	

}
