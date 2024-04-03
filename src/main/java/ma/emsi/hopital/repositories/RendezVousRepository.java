package ma.emsi.hopital.repositories;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
