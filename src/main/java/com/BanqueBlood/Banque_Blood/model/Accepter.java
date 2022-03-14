package com.BanqueBlood.Banque_Blood.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Accepter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date = LocalDate.now();
    @ManyToOne
    private Utilisateur accepteur;
    @ManyToOne
    private Demande demande;
    private  String etat;
    private LocalDate dateQuarantaine;
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Utilisateur getAccepteur() {
        return accepteur;
    }

    public void setAccepteur(Utilisateur accepteur) {
        this.accepteur = accepteur;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public LocalDate getDateQuarantaine() {
        return dateQuarantaine;
    }

    public void setDateQuarantaine(LocalDate dateQuarantaine) {
        this.dateQuarantaine = dateQuarantaine;
    }
}
