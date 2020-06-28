package com.zennou.ecomercebackend.repository;

import com.zennou.ecomercebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByTitle(String title);
}
