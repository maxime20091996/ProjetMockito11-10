package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public interface IMedecinService {

	public boolean engagerMedecin(Medecin pMed,IMedecinDao iMed);
	public Medecin LireInfoMedecin(int idMedecin/*,IMedecinDao iMed*/);
	public void consulter (Patient p);
}
