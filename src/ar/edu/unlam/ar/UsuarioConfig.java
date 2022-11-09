package ar.edu.unlam.ar;

public class UsuarioConfig extends Usuario implements Configurable {

	public UsuarioConfig(Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	@Override
	public boolean agregarUsuarios(Alarma alarma, Usuario usuario, String codigo) throws CodigoAlarmaIncorrectoException {
		if(alarma.getCodigoDeConfig().equals(codigo)) {
			alarma.usuariosValidos.add(usuario);
			return true;
		}
		throw new CodigoAlarmaIncorrectoException("Codigo incorrecto");
	}
	
	@Override
	public boolean agregarSensorAUnaAlarma(Alarma alarma, Sensor sensor, String codigo) throws SensorDuplicadoException {
		if(alarma.getCodigoDeConfig().equals(codigo) || alarma.sensores.contains(sensor)==false) {
			return alarma.sensores.add(sensor);
		}
		throw new SensorDuplicadoException("Este sensor ya existe");
	}
	
	@Override
	public void activarSensorDeAlarma(Alarma alarma, Sensor sensor, String codigo) {
		if(alarma.getCodigoDeConfig().equals(codigo)) {
			sensor.setEstado(true);
		}
	}
	
	

}
