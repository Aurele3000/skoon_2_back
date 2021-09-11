package fr.aurele.skoon_2.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String nom;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id",referencedColumnName = "id")
    private Adresse adresse;

    @OneToMany(mappedBy = "evenement")
    private List<Participant> participants;

    public Evenement() {
    }
}
