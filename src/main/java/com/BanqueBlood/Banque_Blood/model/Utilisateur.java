package com.BanqueBlood.Banque_Blood.model;

import com.BanqueBlood.Banque_Blood.Profils;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomComplet;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false, unique = true)
    private String telephone;


    @Column(nullable = false)
    private String password;

    @Enumerated
    private Profils profils;

    @ManyToOne
    private GroupeSanguin groupeSanguin;

    @ManyToOne
    private Admin admin;





    public Utilisateur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }






    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profils getProfils() {
        return profils;
    }

    public void setProfils(Profils profils) {
        this.profils = profils;
    }




    public GroupeSanguin getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(GroupeSanguin groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


}
