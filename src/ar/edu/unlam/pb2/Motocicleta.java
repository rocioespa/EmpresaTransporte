package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Motocicleta extends Vehiculo {
	private Integer acompaņante;
	private final Integer limite_acompaņante = 1;

	public Motocicleta(Chofer choferes,  Integer acompaņante, Double km) {
		super(choferes, km);
		this.acompaņante= acompaņante;
	}

	@Override
	public Boolean limitePasajero() {
		if(this.acompaņante<=this.limite_acompaņante) {
			return true;
		}
		return false;
	}

	public Chofer condicion() {
		if(this.acompaņante!=null)
	}
	
	public Chofer eliminarChofer() {
		Chofer c = getChoferes();
		return  c = null;
	}

}
