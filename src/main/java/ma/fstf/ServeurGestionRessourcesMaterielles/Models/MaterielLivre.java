package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class MaterielLivre {
    @Id
    private String code_barre;
    @Column
    private LocalDate date_livraison;
    @Column
    private int duree_garentie;
    @Column
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "materiel_id" , referencedColumnName = "id")
    private Materiel materiel;
    //cascade => les operations effectuees sur MaterielLivre doivent etre egalement appliquees a Materiel
    @ManyToOne
    @JoinColumn(name = "ensiegnant_id")
    private Ensiegnant ensiegnant;
    @OneToMany
    @JoinColumn(name = "ressource_id")
    private List<Panne> pannes;
}
