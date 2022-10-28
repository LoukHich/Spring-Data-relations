package com.example.foodlydatalayer.entities;

import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/*CREATE TABLE `utilisateur` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
)*/
@Entity
@Data
@Setter @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    @Column(columnDefinition = "varchar(255) default null")
    private String nom ;
    @Column(columnDefinition = "varchar(255) default null")
    private String prenom ;
    @NotNull
    @Column(unique = true)
    private  String email ;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "langue_ID")
    private Langue langue;

}
