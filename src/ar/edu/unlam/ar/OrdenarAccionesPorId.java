package ar.edu.unlam.ar;

import java.util.Comparator;

public class OrdenarAccionesPorId implements Comparator<Accion> {


	@Override
	public int compare(Accion o1, Accion o2) {
		if(o1.getId().compareTo(o2.getId())==0) {
			return o1.getId().compareTo(o2.getId());
		}
		return o2.getId().compareTo(o1.getId());

	}

}
