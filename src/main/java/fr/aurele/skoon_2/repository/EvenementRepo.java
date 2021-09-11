package fr.aurele.skoon_2.repository;

import fr.aurele.skoon_2.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementRepo extends JpaRepository<Evenement, Integer> {
    public List<Evenement> findByNomContaining(String nom);
    public List<Evenement> findByDescriptionContaining(String description);
}
