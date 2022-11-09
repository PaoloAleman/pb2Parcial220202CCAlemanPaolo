package ar.edu.unlam.ar;

public interface Configurable {


	boolean agregarUsuarios(Alarma alarma, Usuario usuario, String codigo) throws CodigoAlarmaIncorrectoException;

	boolean agregarSensorAUnaAlarma(Alarma alarma, Sensor sensor, String codigo) throws SensorDuplicadoException;

	void activarSensorDeAlarma(Alarma alarma, Sensor sensor, String codigo);

}
