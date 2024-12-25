package it.project.service;

import java.util.List;


import it.project.entity.Utente;

/**
*
* @author Stefano Galdieri
*/


public interface UtenteService {
	
	
	 public List<Utente> getAllUtente();

	    public Utente getUtente(Long id);

	    public void addUtente(Utente player);

	    public Utente updateUtente(Long id, Utente player);

	    public void deleteUtente(Long id);

	

}
