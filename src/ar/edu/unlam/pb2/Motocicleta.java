package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Motocicleta extends Vehiculo {
	private Integer acompa�ante;
	private final Integer limite_acompa�ante = 1;

	public Motocicleta(Chofer choferes,  Integer acompa�ante, Double km) {
		super(choferes, km);
		this.acompa�ante= acompa�ante;
	}

	@Override
	public Boolean limitePasajero() {
		if(this.acompa�ante<=this.limite_acompa�ante) {
			return true;
		}
		return false;
	}

	public Chofer condicion() {
		if(this.acompa�ante!=null)
	}
	
	public Chofer eliminarChofer() {
		Chofer c = getChoferes();
		return  c = null;
	}

}
