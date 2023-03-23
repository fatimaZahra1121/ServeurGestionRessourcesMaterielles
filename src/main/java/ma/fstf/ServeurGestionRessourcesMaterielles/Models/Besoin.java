package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class Besoin {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String description;
    @Column
    private int qte;
    @ManyToOne
    @JoinColumn(name = "ensiegnant_id")
    private Ensiegnant ensiegnant;
    @ManyToOne
    @JoinColumn(name = "appel_offre_id")
    private AppelOffre appelOffre;
}
