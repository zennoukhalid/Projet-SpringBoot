package com.zennou.ecomercebackend.repository;

import com.zennou.ecomercebackend.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
