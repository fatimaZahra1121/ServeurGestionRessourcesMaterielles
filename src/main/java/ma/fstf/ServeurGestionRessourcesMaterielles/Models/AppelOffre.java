package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class AppelOffre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero_appel;
    @Column
    private LocalDate date_debut;
    @Column
    private LocalDate date_fin;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "appel_offre_id")
    private List<Besoin> besoins;

    public int getNumero_appel() {
        return numero_appel;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public List<Besoin> getBesoins() {
        return besoins;
    }

    public void setNumero_appel(int numero_appel) {
        this.numero_appel = numero_appel;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public void setBesoins(List<Besoin> besoins) {
        this.besoins = besoins;
    }
}
