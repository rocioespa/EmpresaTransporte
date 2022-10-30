package ar.edu.unlam.pb2;

public abstract class Vehiculo {
	private Chofer choferes;
	private Double km;

	public Vehiculo(Chofer choferes,  Double km) {
		super();
		this.km = km;
		this.choferes = choferes;
		
	}

	public Chofer getChoferes() {
		return choferes;
	}

	public void setChoferes(Chofer choferes) {
		this.choferes = choferes;
	}
	
	public abstract Boolean limitePasajero();
	
	
	

}
