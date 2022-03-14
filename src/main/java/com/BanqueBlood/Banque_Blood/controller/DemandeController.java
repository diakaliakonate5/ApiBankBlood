package com.BanqueBlood.Banque_Blood.controller;

import com.BanqueBlood.Banque_Blood.model.Demande;
import com.BanqueBlood.Banque_Blood.services.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Demande")
public class DemandeController {
    @Autowired
    DemandeService demandeService;
    @PostMapping("/Ajout")
    Demande Ajout(@RequestBody Demande demande){
        return  demandeService.ajoutDemande(demande);

    }
    @GetMapping("/listDemande")
    List<Demande> listDemande()                  {
        return demandeService.afficherListDemande();
    }
    @GetMapping("/ById/{id}")
    Demande Demandebyid(@PathVariable("id") Long id){
        return  demandeService.afficherDemandeById(id);
    }
    @DeleteMapping("/suprimerDemande/{id}")
    void supprimerDemande(@PathVariable("id") Long id){
        demandeService.supprimerDemande(id);
    }
    @PutMapping("/modifierUtilisateur/{id}")
    Demande modifierDemande(@PathVariable("id")Long id, @RequestBody Demande demande){
        return demandeService.modifierDemande(demande, id);
    }
}
