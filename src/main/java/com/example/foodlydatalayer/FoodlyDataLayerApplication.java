package com.example.foodlydatalayer;

import com.example.foodlydatalayer.entities.Langue;
import com.example.foodlydatalayer.entities.Utilisateur;
import com.example.foodlydatalayer.reposetories.LangueRepo;
import com.example.foodlydatalayer.reposetories.UtilisteurRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class FoodlyDataLayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodlyDataLayerApplication.class, args);
    }
//@Transactional
    @Bean
    public CommandLineRunner start(UtilisteurRepo utilisteurRepo, LangueRepo langueRepo){
        return  args -> {
            Utilisateur user1 =new Utilisateur();
            user1.setNom("Nadori");
            user1.setPrenom("Hicham");
            user1.setEmail("hichamloukili199@gmail.com");
            Utilisateur user2 =new Utilisateur();
            user2.setNom("Loukili");
            user2.setPrenom("Hicham");
            user2.setEmail("hichamloukili98@gmail.com");

            Langue langue = new Langue();
            langue.setNom("Fr");
            langue.addUser(user1);
            langue.addUser(user2);

           // langue.setUtilisateur(user1);
            langueRepo.save(langue);


           Utilisateur l = utilisteurRepo.findById(1l).get();
            System.out.println(l);
        //    System.out.println(l.getLangue().getNom());
//            utilisteurRepo.save(user2);
//            utilisteurRepo.save(user1);

        };
    }

}
