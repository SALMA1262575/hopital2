package ma.emsi.hopital.repositories;

import ma.emsi.hopital.entities.Consultation;
import ma.emsi.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
