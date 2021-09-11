package fr.aurele.skoon_2.repository;

import fr.aurele.skoon_2.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresseRepo extends JpaRepository<Adresse, Integer> {
    public List<Adresse> findByVilleContaining(String ville);
    public List<Adresse> findByRueContaining(String rue);
    public List<Adresse> findByCodePostalContaining(String code_postal);
}
