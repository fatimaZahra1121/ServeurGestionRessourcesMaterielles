package ma.fstf.ServeurGestionRessourcesMaterielles.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String message;
    @ManyToOne
    @JoinColumn(name = "emetteur_id")
    private User emetteur;
    @ManyToOne
    @JoinColumn(name = "recepteur_id")
    private User recepteur;
}
