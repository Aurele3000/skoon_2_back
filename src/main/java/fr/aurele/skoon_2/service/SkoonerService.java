package fr.aurele.skoon_2.service;

import fr.aurele.skoon_2.model.Skooner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SkoonerService {

    Optional<Skooner> findById(Integer id);
    /*Optional<Skooner> findByPseudo(String pseudo);*/
    List<Skooner> findAll(String search);
    Skooner insert(Skooner skooner);
    Skooner update(Integer id, Skooner skooner);
    void delete(Integer id);
}
