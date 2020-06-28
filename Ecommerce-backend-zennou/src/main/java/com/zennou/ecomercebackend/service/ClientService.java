package com.zennou.ecomercebackend.service;

import com.zennou.ecomercebackend.entity.Client;
import com.zennou.ecomercebackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client getClientByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    public String deleteClient(int id) {
        clientRepository.deleteById(id);
        return "Client removed with succes: "+id;
    }

    public Client updateClient(Client client) {
        Client existingClient = clientRepository.findById(client.getId()).orElse(null);
        existingClient.setNom(client.getNom());
        existingClient.setPrenom(client.getPrenom());
        existingClient.setAddress(client.getAddress());
        existingClient.setVille(client.getVille());
        existingClient.setEmail(client.getEmail());
        existingClient.setPassword(client.getPassword());
        existingClient.setPhoneNumber(client.getPhoneNumber());
        existingClient.setZipCode(client.getZipCode());
        existingClient.setCommande(client.getCommande());
        return clientRepository.save(existingClient);

    }

}
