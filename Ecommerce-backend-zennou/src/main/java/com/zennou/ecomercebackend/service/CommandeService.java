package com.zennou.ecomercebackend.service;

import com.zennou.ecomercebackend.entity.Commande;
import com.zennou.ecomercebackend.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService  {
    @Autowired
    private CommandeRepository commandeRepository;

    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public List<Commande> saveCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    public List<Commande> getCommandes() {
        return commandeRepository.findAll();
    }

    public Commande getCommandeById(int id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public String deleteCommande(int id) {
        commandeRepository.deleteById(id);
        return "Commande removed: "+id;
    }

    public Commande updateCommande(Commande commande) {
        Commande existingCommande = commandeRepository.findById(commande.getId()).orElse(null);
        existingCommande.setClient(commande.getClient());
        existingCommande.setProduct(commande.getProduct());
        existingCommande.setQuantity(commande.getQuantity());
        return commandeRepository.save(existingCommande);
    }
}
