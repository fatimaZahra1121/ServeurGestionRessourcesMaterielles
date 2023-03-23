package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Fournisseur {
    @Id
    private String nom_societe;
    @Column
    private String adresse;
    @Column
    private String email;
    @Column
    private String gerant;
    @Column
    private String pass;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fournisseur_id")
    private List<Message> messages;
}
