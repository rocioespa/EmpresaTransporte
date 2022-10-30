package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Autobus extends Vehiculo {
	private Integer pasajeros;
	private final Integer limite_pasajero = 20;

	public Autobus(Chofer choferes, Integer pasajeros, Double km) {
		super(choferes, km);
		this.pasajeros=pasajeros;
	}

	public Integer getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Integer pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Integer getLimite_pasajero() {
		return limite_pasajero;
	}
	
	@Override
	public Boolean limitePasajero() {
		if(this.pasajeros<=this.limite_pasajero) {
			return true;
		}
		return false;
	}
	

}
