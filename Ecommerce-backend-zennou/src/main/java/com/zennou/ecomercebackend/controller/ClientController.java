package com.zennou.ecomercebackend.controller;

import com.zennou.ecomercebackend.entity.Client;
import com.zennou.ecomercebackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @CrossOrigin
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @CrossOrigin
    @GetMapping("/clients")
    public List<Client> findAllClients() {
        return clientService.getClients();
    }

    @CrossOrigin
    @GetMapping("/client/{id}")
    public Client findClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @CrossOrigin
    @GetMapping("/client/login/{email}")
    public Client findClientByEmail(@PathVariable String email) {
        return clientService.getClientByEmail(email);
    }

    @CrossOrigin
    @PutMapping("/client/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @CrossOrigin
    @DeleteMapping("/client/delete/{id}")
    public String deleteClient(@PathVariable int id) {
        return clientService.deleteClient(id);
    }
}
