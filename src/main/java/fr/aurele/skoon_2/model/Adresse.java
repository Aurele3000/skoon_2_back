package fr.aurele.skoon_2.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String ville;

    private String rue;

    private int codePostal;

    private String geolocalisation;

    @OneToOne(mappedBy = "adresse")
    private Skooner skooner;

    @OneToOne(mappedBy = "adresse")
    private Evenement evenement;

    public Adresse() {
    }
}
