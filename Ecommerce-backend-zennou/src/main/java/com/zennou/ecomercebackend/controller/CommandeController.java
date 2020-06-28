package com.zennou.ecomercebackend.controller;

import com.zennou.ecomercebackend.entity.Commande;
import com.zennou.ecomercebackend.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {
    @Autowired
    private CommandeService commandeService;

    @CrossOrigin
    @PostMapping("/addCommande")
    public Commande addCommande(@RequestBody Commande product) {
        return commandeService.saveCommande(product);
    }

    @CrossOrigin
    @PostMapping("/addCommandes")
    public List<Commande> addCommandes(@RequestBody List<Commande> products) {
        return commandeService.saveCommandes(products);
    }

    @CrossOrigin
    @GetMapping("/commandes")
    public List<Commande> findAllcommandes() {
        return commandeService.getCommandes();
    }

    @CrossOrigin
    @GetMapping("/commandes/{id}")
    public Commande findCommandeById(@PathVariable int id) {
        return commandeService.getCommandeById(id);
    }

    @CrossOrigin
    @PutMapping("/commande/update")
    public Commande updateCommande(@RequestBody Commande product) {
        return commandeService.updateCommande(product);
    }

    @CrossOrigin
    @DeleteMapping("/commande/delete/{id}")
    public String deleteCommande(@PathVariable int id) {
        return commandeService.deleteCommande(id);
    }
}
