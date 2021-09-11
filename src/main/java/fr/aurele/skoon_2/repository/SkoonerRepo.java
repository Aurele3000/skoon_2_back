package fr.aurele.skoon_2.repository;

import fr.aurele.skoon_2.model.Skooner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkoonerRepo extends JpaRepository<Skooner, Integer> {

    /*public List<Skooner> findByPseudoContaining(String pseudo);*/
    public List<Skooner> findSkoonerById(Integer id);
}
