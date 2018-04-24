package org.formacion.factorymethod;

public abstract class LavadoraFactory {
	public Lavadora crea () {
		Lavadora lavadora = creaLavadora();
		
		lavadora.ponerTambor();
		lavadora.ponerMandos();
		
		return lavadora;
		
	}
	abstract protected Lavadora creaLavadora();
}
