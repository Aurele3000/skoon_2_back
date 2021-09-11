package fr.aurele.skoon_2.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String activites;

    @ManyToOne
    @JoinColumn(name = "skooner_id",referencedColumnName = "id")
    private Skooner skooner;

    @ManyToOne
    @JoinColumn(name = "evenement_id",referencedColumnName = "id")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

    public Participant() {
    }
}
