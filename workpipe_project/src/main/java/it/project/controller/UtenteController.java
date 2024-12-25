package it.project.controller;

import java.util.List;
import it.project.entity.Utente;
import it.project.service.UtenteServiceDB;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


/**
*
* @author Stefano Galdieri
*/

@RestController
@RequestMapping("/api/utente")
public class UtenteController {
	

	@Autowired
	private UtenteServiceDB utenteService;
	
	@GetMapping
	public List<Utente> getAllUtente() {
		return utenteService.getAllUtente();
	}
	
	 @GetMapping("/{id}")
	 public Utente getUtente(@PathVariable Long id) {
		 return utenteService.getUtente(id);
	}	 
		 

	@PostMapping
	 public void addUtente(@RequestBody Utente utente) {
		utenteService.addUtente(utente);
	}
	
	 @PutMapping("/{id}")
	    public void updateUtente(@PathVariable Long id, @RequestBody Utente utente) {
	        utenteService.updateUtente(id, utente);
	    }

	 @DeleteMapping("/{id}")
	    public void deleteUtente(@PathVariable Long id) {
	        utenteService.deleteUtente(id);
	    }
	

}
