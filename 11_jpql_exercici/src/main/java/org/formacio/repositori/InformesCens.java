package org.formacio.repositori;

import java.util.List;

import javax.persistence.TypedQuery;

import org.formacio.domain.Persona;

@Repository
public class InformesCens {

	/**
	 * Retorna la llista de persones que viuen al municipi indicat
	 */
	public List<Persona> habitantsMunicipi(String municipi) {
		
		TypedQuery<Persona> query = .createQuery("select persona from Persona persona where nom = :nom", Persona.class);
		
		query.setParameter("Persona", "municipio");
		List<Persona> resultat = query.getResultList();
		
		
	return resultat;
			}

	/**
	 * Retorna el nombre d'habitants de la illa
	 */
	public int nombreHabitantsIlla(String illa) {
		return 0;
	}
	
	/**
	 * Retorna el nombre d'habitants del municipi que son menors d'edat
	 */
	public int nombreHabitantsMenorsEdat(String municipi) {
		return 0;
	}

	/**
	 * Retorna la llista de persones que no tenen informat de quin municipi son
	 */
	public List<Persona> llistaPersonesSenseMunicipi() {
		return null;
    }

	/**
	 * Retorna la llista de noms de persones d'una illa ordenats per l'edat
	 * siii, ja ho se ..., no hem vist com ordenar, pero emprau order by i la vostra intuicio ;-)
	 */
	public List<String> llistaNomsPersonesOrdenatPerEdat(String illa) {
		return null;
    }
	
}
