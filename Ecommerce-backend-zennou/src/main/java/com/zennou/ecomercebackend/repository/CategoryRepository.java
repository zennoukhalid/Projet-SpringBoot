package com.zennou.ecomercebackend.repository;

import com.zennou.ecomercebackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByCategoryName(String name);
}
