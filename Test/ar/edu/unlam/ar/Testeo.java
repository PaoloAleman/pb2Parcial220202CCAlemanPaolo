package ar.edu.unlam.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Alarma alarma= new Alarma();
		Central central= new Central();
		assertTrue(usuario.agregarAlarma(alarma, central));
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioALaCentral() {
		UsuarioAdmin usuario= new UsuarioAdmin(1,"Luffy");
		Usuario usuario2= new UsuarioConfig(2,"Luffy");
		Central central= new Central();
		usuario.agregarUsuario(usuario2, central);
		Integer valorEsperado= 2;
		Integer valorObtenido= central.usuarios.size();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		UsuarioAdmin usuario= new UsuarioAdmin(1, "Luffy");
		Usuario usuario2= new UsuarioConfig(1, "Luffy");
		Alarma alarma= new Alarma(1, 1, "A1", "Alarma");
		usuario.agregarUnUsuarioAUnaAlarma(usuario2.getDni(),alarma.getId(),alarma.getCodigoDeConfig());
	}
	
	
}
