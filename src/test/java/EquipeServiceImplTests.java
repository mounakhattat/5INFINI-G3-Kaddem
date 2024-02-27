
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.entities.Niveau;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import tn.esprit.spring.khaddem.repositories.EquipeRepository;
import tn.esprit.spring.khaddem.services.EquipeServiceImpl;

@ExtendWith(MockitoExtension.class)
public class EquipeServiceImplTests {

    @Mock
    EquipeRepository equipeRepository;

    @Mock
    ContratRepository contratRepository;

    @InjectMocks
    EquipeServiceImpl equipeServiceImpl;

    @Test
    public void testEvoluerEquipes() {
        // Préparation des données de test
        Equipe equipe1 = new Equipe();
        equipe1.setIdEquipe(1);
        equipe1.setNomEquipe("Equipe Senior");
        equipe1.setNiveau(Niveau.SENIOR);

        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe1);

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setIdEtudiant(1);

        Contrat contrat1 = new Contrat();
        contrat1.setIdContrat(1);
        contrat1.setDateDebutContrat(new Date());
        contrat1.setDateFinContrat(new Date());
        contrat1.setArchived(false);
        contrat1.setEtudiant(etudiant1);

        List<Contrat> contrats = new ArrayList<>();
        contrats.add(contrat1);

        // Configuration du comportement du repository simulé (mock)
        when(equipeRepository.findAll()).thenReturn(equipes);
       // when(contratRepository.findByEtudiantIdEtudiant(1)).thenReturn(contrats);

        // Exécution de la méthode à tester
        equipeServiceImpl.evoluerEquipes();

        // Vérification du résultat
        assertEquals(Niveau.SENIOR, equipe1.getNiveau());
    }
}
