package ar.edu.unlam.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Alarma alarma= new Alarma(1, 1, "A1", "Alarma");
		Central central= new Central();
		usuario.agregarAlarma(alarma, central);
		Integer valorEsperado= 1;
		Integer valorObtenido= central.getAlarmas().size();
		assertEquals(valorEsperado, valorObtenido);
		}
	
	@Test
	public void queSePuedaAgregarUnUsuarioALaCentral() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Usuario usuario2= new UsuarioConfig(2,"Luffy");
		Central central= new Central();
		usuario.agregarUsuario(usuario2, central);
		Integer valorEsperado= 1;
		Integer valorObtenido= central.getUsuarios().size();
		assertEquals(valorEsperado, valorObtenido);
	}

	
	@Test
	public void queAlAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionInvalidoSeLanceUnaExcepcion() {
		UsuarioAdmin usuario= new UsuarioAdmin(1, "Luffy");
		Usuario usuario2= new UsuarioConfig(1, "Luffy");
		Alarma alarma= new Alarma(1, 1, "A1", "Alarma");
		try {
			usuario.agregarUnUsuarioAAlarma(usuario2, alarma, alarma.getCodigoDeConfig());
		} catch (CodigoIncorrectoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer valorEsperado= 1;
		Integer valorObtenido= alarma.usuariosValidos.size();
		assertEquals(valorEsperado, valorObtenido);
	
	}
	
	@Test
	public void queAlAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaExcepcion() {
		UsuarioAdmin usuario= new UsuarioAdmin(1, "Luffy");
		Sensor sensor= new Sensor(1, true);
		Alarma alarma= new Alarma(1, 1, "A1", "Alarma");
		try {
			usuario.agregarUnSensorAUnaAlarma(sensor, alarma);
		} catch (SensorDuplicadoException e) {
			e.printStackTrace();
		}
		Integer valorEsperado= 1;
		Integer valorObtenido= alarma.sensores.size();
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void queSeHayaActivadoLaAlarma() {
		UsuarioAdmin usuario= new UsuarioAdmin(1, "Luffy");
		Sensor sensor= new Sensor(1, true);
		Alarma alarma= new Alarma(1, 1, "A1", "Alarma");
		try {
			usuario.agregarUnSensorAUnaAlarma(sensor, alarma);
		} catch (SensorDuplicadoException e) {
			e.printStackTrace();
		}
		usuario.activarSensorDeAlarma(alarma, sensor, alarma.getCodigoDeConfig());
		Boolean valorEsperado= true;
		Boolean valorObtenido= sensor.getEstado();
		assertEquals(valorEsperado, valorObtenido);

	}
	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {
		
		
	}
	
	
}
