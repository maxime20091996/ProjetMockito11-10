package eu.ensup.cabinet.service;

import org.mockito.InjectMocks;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService implements IMedecinService{
	
	private Medecin pMed;
	private IMedecinDao iMed;

	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}
	
	public MedecinService(IMedecinDao iMed) {
		super();
		this.iMed = iMed;
	}
	

	public boolean engagerMedecin(Medecin pMed,IMedecinDao iMed){
		iMed.create(pMed);
		return true;
	}
	public Medecin LireInfoMedecin(int idMedecin/*,IMedecinDao iMed*/){
		return iMed.getById(idMedecin);

	}
 

	public void consulter (Patient p){
		System.out.println("le médecin "+pMed.getPrenom()+" dont la spécialité est: "+pMed.getSpecialite()+" consulte le patient "+p.getPrenom()+" pour traiter le symptome: "+p.getSymptome());
	}
}
