package com.BanqueBlood.Banque_Blood.repository;

import com.BanqueBlood.Banque_Blood.model.Accepter;
import com.BanqueBlood.Banque_Blood.model.Confirmer;
import com.BanqueBlood.Banque_Blood.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ConfirmerRepository extends JpaRepository <Confirmer, Long> {
    Optional<Confirmer> findConfiremerByUtilisateur(Long id);
    Confirmer findByAccepter(Accepter accepter);
}
