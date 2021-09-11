package fr.aurele.skoon_2.service;

import fr.aurele.skoon_2.repository.EvenementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenementServiceImpl implements EvenementService {
    @Autowired
    private EvenementRepo evenementRepo;

}
