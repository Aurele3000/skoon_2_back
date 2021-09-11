package fr.aurele.skoon_2.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String nomRole;

    @OneToMany(mappedBy = "role")
    private List<Participant> participants;

    public Role() {
    }
}
