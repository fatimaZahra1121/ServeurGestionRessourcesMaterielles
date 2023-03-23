package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Materiel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private double prix;
    @OneToOne(mappedBy = "materiel")
    private MaterielLivre materielLivre;
    @ManyToOne
    @JoinColumn(name = "proposition_id")
    private Proposition proposition;
}
