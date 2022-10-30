package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class EmpresaTransporte {
	private ArrayList<Vehiculo> vehiculos;

	public EmpresaTransporte() {
		super();
		this.vehiculos = new ArrayList<>();
	}
	
	

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}



	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}



	public void agregarVehiculo(Vehiculo vehiculo) {
		if(vehiculo.limitePasajero()) {
			this.vehiculos.add(vehiculo);
		}
		
	}

	

}
