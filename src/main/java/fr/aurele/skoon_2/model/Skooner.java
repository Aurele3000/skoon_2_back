package fr.aurele.skoon_2.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "skooner")
public class Skooner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String pseudo;

    private String nom;

    private String prenom;

    private int age;

    private String mail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id",referencedColumnName = "id")
    private Adresse adresse;

    @OneToMany(mappedBy = "skooner")
    private List<Participant> participants;

    public Skooner() {
    }
 }
