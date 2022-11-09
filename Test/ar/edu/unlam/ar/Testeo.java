package ar.edu.unlam.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Alarma alarma= new Alarma();
		assertTrue(usuario.agregarAlarma(alarma));
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Usuario usuario2= new UsuarioConfig(2,"Luffy");
		Boolean valorEsperado= true;
		Boolean valorObtenido= usuario.agregarUsuario(usuario2);
		assertEquals(valorEsperado, valorObtenido);
	}
}
