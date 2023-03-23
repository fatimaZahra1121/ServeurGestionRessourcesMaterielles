package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Proposition {
    @Id
    private int numero_proposition;
    @Column
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "appel_offre_id")
    private AppelOffre appelOffre;
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany
    @JoinColumn(name = "proposition_id")
    private List<Materiel> materiels;

}
