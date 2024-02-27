package tn.esprit.spring.khaddem.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.spring.khaddem.KhaddemApplication;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.entities.Option;
import tn.esprit.spring.khaddem.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
//@ExtendWith(SpringExtension.class)
//@Transactional //===> @Transactional, toutes les modifications apportées à la//
//base de données pendant le test seront annulées après l'exécution du test
// ce qui garantit que l'état de la base de données reste inchangé.

//@SpringBootTest //Annotation pour test
        //@Rollback
//mounaaaa
class EtudiantServiceImplTest {
 /*   @Autowired
    private EtudiantServiceImpl etudiantService;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    void testAddEtudiant() {
        Etudiant etudiant = new Etudiant();
        etudiant.setPrenomE("yassine");
        etudiant.setNomE("test");
        etudiant.setOp(Option.SE);

        Etudiant savedEtudiant = etudiantService.addEtudiant(etudiant);

        assertNotNull(savedEtudiant);
        assertNotNull(savedEtudiant.getIdEtudiant());
        assertEquals("yassine", savedEtudiant.getPrenomE());
        assertEquals("test", savedEtudiant.getNomE());
        assertEquals(Option.SE, savedEtudiant.getOp());

        // Recherchez étudiant dans la base de données et verfier qu'il est ajouter avec succes
        Etudiant retrievedEtudiant = etudiantRepository.findById(savedEtudiant.getIdEtudiant()).orElse(null);
        assertNotNull(retrievedEtudiant);
        assertEquals("yassine", retrievedEtudiant.getPrenomE());
        assertEquals("test", retrievedEtudiant.getNomE());
        assertEquals(Option.SE, retrievedEtudiant.getOp());
    }
*/
}
