package com.BanqueBlood.Banque_Blood.controller;

import com.BanqueBlood.Banque_Blood.model.Accepter;

import com.BanqueBlood.Banque_Blood.services.AccepterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Accepter")
@CrossOrigin
public class AccepterController {
    @Autowired
    AccepterService accepterService;
    @PostMapping("/Ajout")
    Accepter Ajout(@RequestBody Accepter accepter){
        return  accepterService.ajoutAccept(accepter);
    }
    @GetMapping("/listAccept")
    List<Accepter> listAccepter()                  {
        return accepterService.afficherListAccept();
    }

    @GetMapping("/ById/{id}")
    Accepter AcceptById(@PathVariable("id") Long id){
        return  accepterService.afficherAcceptById(id);
    }

    @GetMapping("/AcceptByUser/{id}")
    List<Accepter> AcceptByUser(@PathVariable("id") Long id){
        return  accepterService.AcceptByUser(id);
    }

    @DeleteMapping("/deleteAccept/{id}")
    void deleteAccept(@PathVariable("id")Long id){
        accepterService.supprimerAccept(id);
    }

    @PutMapping("/modifierAccept/{id}")
    Accepter modifierAccept(@PathVariable("id")Long id, @RequestBody Accepter accepter){
        return accepterService.modifierAccept(accepter, id);
    }


}
