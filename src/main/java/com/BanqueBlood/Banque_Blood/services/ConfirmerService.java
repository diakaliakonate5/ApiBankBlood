package com.BanqueBlood.Banque_Blood.services;
import com.BanqueBlood.Banque_Blood.model.Confirmer;
import java.util.List;
public interface ConfirmerService {
    Confirmer ajoutConfirmer(Confirmer confirmer);
    List<Confirmer> afficherListConfirm();
    void supprimerConfirm(Long id);
    Confirmer modifierConfirm(Confirmer confirmer, Long id);
    Confirmer afficherConfirmById(Long id);
}
