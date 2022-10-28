package com.example.foodlydatalayer.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Langue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "langue")
    private List<Utilisateur> utilisateurs= new ArrayList<>();

    public void addUser(Utilisateur user){
        utilisateurs.add(user);
        user.setLangue(this);

    }

}
