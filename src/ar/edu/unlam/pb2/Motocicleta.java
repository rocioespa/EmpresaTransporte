package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Motocicleta extends Vehiculo {
	private Integer acompañante;
	private final Integer limite_acompañante = 1;

	public Motocicleta(Chofer choferes,  Integer acompañante, Double km) {
		super(choferes, km);
		this.acompañante= acompañante;
	}

	@Override
	public Boolean limitePasajero() {
		if(this.acompañante<=this.limite_acompañante) {
			return true;
		}
		return false;
	}

	public Chofer condicion() {
		if(this.acompañante!=null)
	}
	
	public Chofer eliminarChofer() {
		Chofer c = getChoferes();
		return  c = null;
	}

}
