package com.BanqueBlood.Banque_Blood.serviceImp;

import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.repository.DemandeRepository;
import com.BanqueBlood.Banque_Blood.services.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandeServiceImpl implements DemandeService {
    @Autowired
    DemandeRepository demandeRepository;
    @Override
    public Demande ajoutDemande(Demande demande) {
        return demandeRepository.save(demande);
    }

    @Override
    public List<Demande> afficherListDemande() {
        return demandeRepository.findAll();
    }

    @Override
    public void supprimerDemande(Long id) {
        demandeRepository.deleteById(id);

    }

    @Override
    public Demande modifierDemande(Demande demande, Long id) {
        Demande  demande1 = demandeRepository.findById(id).get();
        demande1.setDate(demande.getDate());
        demande1.setNbrepoche(demande.getNbrepoche());
        demande1.setNomHopital(demande.getNomHopital());
        return demandeRepository.save(demande1);
    }

    @Override
    public Demande afficherDemandeById(Long id) {
        return demandeRepository.findById(id).get();
    }
}
