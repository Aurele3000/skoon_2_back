package fr.aurele.skoon_2.repository;

import fr.aurele.skoon_2.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Integer> {
    public List<Participant> findByActivitesContaining(String activites);
}
