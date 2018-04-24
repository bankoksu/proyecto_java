package org.formacion.factorymethod;


public class LavadoraCargaSuperior extends LavadoraFactory {
	
	@Override
    protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
    	   // this.tipoCarga = "superior";
    }
}
