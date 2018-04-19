package org.formacion.builder;

public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;
	
	private Persona() {}
	
	
	public static class Builder {
		private Persona persona;
		
		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}
		
		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}
		
		public static Builder setMayor(int edad, String lugarTrabajo) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			persona.edad = edad;
			persona.lugarTrabajo = lugarTrabajo;
			persona.colegio = null;
			return new builderMayor(persona);
		}
		
		public static Builder setMenor(int edad, String colegio) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			persona.edad = edad;
			persona.colegio = colegio;
			persona.lugarTrabajo = null;
			return new builderMenor(persona);
		}
	
		public Persona build() {
			return persona;
		}

		public Object setMayor(int edad) {
			return edad;
		}

	}
	
	@Override
	public String toString() {
		return nombre;
		
		
		
	}
	
}
