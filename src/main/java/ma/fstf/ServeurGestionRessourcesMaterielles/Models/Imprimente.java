package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Imprimente extends Materiel{
    @Column
    private String marque;
    @Column
    private String resolution;
    @Column
    private double vitesse;
}
