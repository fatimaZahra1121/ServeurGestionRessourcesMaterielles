package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Ordinateur extends Materiel{
    @Column
    private String cpu;
    @Column
    private String disque;
    @Column
    private String ecran;
    @Column
    private String marque;
    @Column
    private String ram;
}
