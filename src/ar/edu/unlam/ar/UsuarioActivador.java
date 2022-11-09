package ar.edu.unlam.ar;

public class UsuarioActivador extends Usuario implements Activable {

	public UsuarioActivador(Integer dni, String nombre) {
		super(dni, nombre);
	}

	@Override
	public boolean activarAlarma(Alarma alarma, Integer integer) {
		if(alarma.getCodigoDeAct().equals(integer)) {
			alarma.setEstado(true);

		}
		return false;
	}

}
