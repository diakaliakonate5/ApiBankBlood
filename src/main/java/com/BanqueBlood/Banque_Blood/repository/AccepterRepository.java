package com.BanqueBlood.Banque_Blood.repository;

import com.BanqueBlood.Banque_Blood.model.Accepter;
import com.BanqueBlood.Banque_Blood.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface AccepterRepository extends JpaRepository <Accepter, Long> {

    @Query(value = "Select a FROM Accepter a WHERE a.etat = 'non_lu' AND a.demande.utilisateur.id =:id")
    List<Accepter> AcceptByUser(@Param("id") Long id);

    @Query("SELECT MAX(a) FROM Accepter a WHERE a.accepteur=:user")
    Accepter findByAccepterUser(@Param("user") Utilisateur utilisateur);
}
