package it.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.project.entity.Utente;
import it.project.repository.UtenteRepository;

/**
*
* @author Stefano Galdieri
*/

@Service
public class UtenteServiceDB implements UtenteService {

	@Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> getAllUtente() {
        return utenteRepository.findAll();
    }

    public Utente getUtente(Long id) {
        Optional<Utente> utente = this.utenteRepository.findById(id);
        if (utente.isPresent()) {
            return utente.get();
        } else {
            return null;
        }
    }

    public void addUtente(Utente utente) {
        utenteRepository.save(utente);
    }

    public Utente updateUtente(Long id, Utente user) {
    	
        Optional<Utente> optionalUtente = utenteRepository.findById(id);
        
        if (optionalUtente.isPresent()) {
            Utente utente = optionalUtente.get();
         
            utente.setNome(user.getNome());
            utente.setCognome(user.getCognome());
            utente.setEmail(user.getEmail());
            utente.setDataNascita(user.getDataNascita());
            return utenteRepository.save(utente);
        } else {
            throw new RuntimeException("Utente non trovato");
        }
    }

    public void deleteUtente(Long id) {
        utenteRepository.deleteById(id);
    }

}
