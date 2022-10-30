package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresa {

	@Test
	public void queSeCreeUnaEmpresa() {
		EmpresaTransporte empresa = new EmpresaTransporte();
		assertNotNull(empresa);
	}
	@Test
	public void queSeAgregueUnAutobusALaEmpresa() {
		EmpresaTransporte empresa = new EmpresaTransporte();
		Chofer fercho = new Chofer ("fercho",1);
		Vehiculo autobus = new Autobus(fercho,15,0.0);
		empresa.agregarVehiculo(autobus);
		assertEquals(1, empresa.getVehiculos().size());
		
	}
	
	@Test
	public void queSeAgregueUnMotocicletaALaEmpresa() {
		EmpresaTransporte empresa = new EmpresaTransporte();
		Chofer fercho = new Chofer ("fercho",1);
		Vehiculo motoc = new Motocicleta(fercho,1,0.0);
		empresa.agregarVehiculo(motoc);
		assertEquals(1, empresa.getVehiculos().size());
		
	}
	

}
