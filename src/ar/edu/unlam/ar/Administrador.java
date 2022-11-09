package ar.edu.unlam.ar;

public interface Administrador {

	void agregarAlarma(Alarma alarma, Central central);

	void activarAlarmas(Alarma alarma, UsuarioActivador usuario);

	void activarSensorDeAlarma(Alarma alarma, Sensor sensor, String codigoDeConfig);

	boolean agregarUnSensorAUnaAlarma(Sensor sensor, Alarma alarma) throws SensorDuplicadoException;

	boolean agregarUnUsuarioAAlarma(Usuario usuario, Alarma alarma, String codigo) throws CodigoIncorrectoException;

	void agregarUsuario(Usuario usuario, Central central);

}
