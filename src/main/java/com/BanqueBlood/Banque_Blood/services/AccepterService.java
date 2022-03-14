package com.BanqueBlood.Banque_Blood.services;

import com.BanqueBlood.Banque_Blood.model.Accepter;


import java.util.List;

public interface AccepterService {
    Accepter ajoutAccept(Accepter accepter);
    List<Accepter> afficherListAccept();
    List<Accepter> AcceptByUser(Long id);
    void supprimerAccept(Long id);
    Accepter modifierAccept(Accepter accepter, Long id);
    Accepter afficherAcceptById(Long id);
}
