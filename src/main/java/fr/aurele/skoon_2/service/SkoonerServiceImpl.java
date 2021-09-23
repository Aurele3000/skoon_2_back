package fr.aurele.skoon_2.service;

import fr.aurele.skoon_2.model.Skooner;
import fr.aurele.skoon_2.repository.SkoonerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkoonerServiceImpl implements SkoonerService {
    @Autowired
    private SkoonerRepo skoonerRepo;

    @Override
    public List<Skooner> findAll() {
        return skoonerRepo.findAll();
    }

    @Override
    public Optional<Skooner> findById(Integer id) {
        return skoonerRepo.findById(id);
    }

    /*@Override
    public Optional<Skooner> findByPseudo(String pseudo) {
        return skoonerRepo.findByPseudo(pseudo);
    }*/

    @Override
    public Skooner insert(Skooner skooner){
        return skoonerRepo.save(skooner);
    }

    @Override
    public Skooner update(Integer id, Skooner skooner) {
        Optional<Skooner> optionalSkooner = this.findById(id);
        if (optionalSkooner.isPresent()){
            return skoonerRepo.save(skooner);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        Optional<Skooner> skooner = this.findById(id);
        if (skooner.isPresent()){
            skoonerRepo.delete(skooner.get());
        }
    }

}
