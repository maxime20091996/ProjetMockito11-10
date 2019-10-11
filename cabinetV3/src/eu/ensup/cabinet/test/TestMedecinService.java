package eu.ensup.cabinet.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InjectMocks;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.service.MedecinService;

public class TestMedecinService {
	
	@Test
	public void testLectureInfoMedecin() {
		/* Scénario de test:
		 * 		La demande de lecture d'information d'un medecin à partir de son identifiant 
		 * 		nous ramène la totalité de ses caractéristiques
		 * */
		
		// 1: Mocker l'interface du dao
		IMedecinDao dao = mock(IMedecinDao.class);
		// 2: Créer le service
		MedecinService meds = new MedecinService(dao);
		// 3: imposer un comportement au mock
		when(dao.getById(1)).thenReturn(new Medecin(1, "herve", "lambert", "Stomatologue"));
		// 4: appeler une méthode du service
		Medecin medReturned = meds.LireInfoMedecin(1);
		// 5: Comparer le resultat réel avec le resultat attendu
		assertEquals(medReturned.getNom(), "herve");

		//  @Mock + times() compte le nombre de fois ou est appelée
		// la méthode
		verify(dao, times(1)).getById(1);
		
	}

}
