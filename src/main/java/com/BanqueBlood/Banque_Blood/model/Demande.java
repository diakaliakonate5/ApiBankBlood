package com.BanqueBlood.Banque_Blood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Demande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private  int nbrepoche ;

    @ManyToOne
    private Utilisateur utilisateur;



@ManyToOne
private GroupeSanguin groupeSanguin;

    private LocalDate date = LocalDate.now();



    public int getNbrepoche() {
        return nbrepoche;
    }

    public void setNbrepoche(int nbrepoche) {
        this.nbrepoche = nbrepoche;
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }





    public GroupeSanguin getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(GroupeSanguin groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
