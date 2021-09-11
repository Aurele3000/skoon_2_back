package fr.aurele.skoon_2.repository;

import fr.aurele.skoon_2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    public List<Role> findByNomRoleContaining(String nom_role);
}
