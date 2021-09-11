package fr.aurele.skoon_2.service;

import fr.aurele.skoon_2.repository.AdresseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseServiceImpl implements AdresseService {
    @Autowired
    private AdresseRepo adresseRepo;
}
