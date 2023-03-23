package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table
public class Ensiegnant extends User{
    @Column
    private String departement;
    @Column
    private boolean status;
    @OneToMany
    @JoinColumn(name = "ensiegnant_id")
    private List<MaterielLivre> ressources;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ensiegnant_id")
    private List<Besoin> besoins;
    //cascade=>CRUD
}
