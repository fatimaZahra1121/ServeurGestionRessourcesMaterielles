package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
@Entity
@Table
public class Panne {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String constat;
    @Column
    private LocalDate date_panne;
    @Column
    private String frequence;
    @ManyToOne
    @JoinColumn(name = "technicien_id")
    private User technicien;
    @ManyToOne
    @JoinColumn(name = "ressource_id")
    private MaterielLivre ressource;
}
