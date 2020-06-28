package com.zennou.ecomercebackend.repository;

import com.zennou.ecomercebackend.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByEmail(String nom);
}
