package ma.emsi.hopital.service;

import ma.emsi.hopital.entities.Consultation;
import ma.emsi.hopital.entities.Medecin;
import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.entities.RendezVous;

public interface IHopitalService {
     Patient savePatient(Patient patient);
     Medecin saveMedecin (Medecin medecin);
     RendezVous saveRDV (RendezVous rendezVous);
     Consultation saveConsultation (Consultation consultation);


}
