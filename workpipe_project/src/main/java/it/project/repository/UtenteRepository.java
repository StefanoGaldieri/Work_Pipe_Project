package it.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.project.entity.Utente;


/**
*
* @author Stefano Gadlieri
*/

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
