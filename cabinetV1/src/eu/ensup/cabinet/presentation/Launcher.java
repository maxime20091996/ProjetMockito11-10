package eu.ensup.cabinet.presentation;

import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

public class Launcher {

	public static void main(String[] args) {

		Medecin med = new Medecin(3,"luc","victor","dentiste");
		Patient pat = new Patient(2,"pierre","leblond","carrie");
		pat.setMedecin(med);
		med.setPatient(pat);
		
		MedecinService meds = new MedecinService(med);
		meds.consulter(pat);
		
		meds.engagerMedecin(med, new MedecinDao());
		//System.out.println(meds.LireInfoMedecin(3, new MedecinDao()));
	}

}
