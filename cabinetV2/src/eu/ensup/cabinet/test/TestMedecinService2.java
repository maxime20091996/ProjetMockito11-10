package eu.ensup.cabinet.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinService2 {

	@Mock // attention importer import org.mockito.Mock;
	IMedecinDao dao;

	@Test
	public void testLectureInfoMedecin2() {
		/* Sc�nario de test:
		 * 		La demande de lecture d'information d'un medecin � partir de son identifiant
		 * 		nous ram�ne la totalit� de ses caract�ristiques
		 * */

		// 1: Mocker l'interface du dao
		// @Mock IMedecinDao dao; dans la classe de test

		// 2: Cr�er le service
		MedecinService meds = new MedecinService(dao);
		// 3: imposer un comportement au mock
		when(dao.getById(1)).thenReturn(new Medecin(1, "herve", "lambert", "Stomatologue"));
		// 4: appeler une m�thode du service
		Medecin medReturned = meds.LireInfoMedecin(1);
		// 5: Comparer le resultat r�el avec le resultat attendu
		assertEquals(medReturned.getNom(), "herve");
	}

}
