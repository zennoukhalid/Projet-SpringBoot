package com.zennou.ecomercebackend.service;

import com.zennou.ecomercebackend.entity.Category;
import com.zennou.ecomercebackend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> saveCategories(List<Category> categories) {
        return categoryRepository.saveAll(categories);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category getCategoryByName(String name) {
        return categoryRepository.findByCategoryName(name);
    }

    public String deleteCategory(int id) {
        categoryRepository.deleteById(id);
        return "Product removed: "+id;
    }

    public Category updateProduct(Category category) {
        Category existingCategory = categoryRepository.findById(category.getId()).orElse(null);
        existingCategory.setCategoryName(category.getCategoryName());
        existingCategory.setProducts(category.getProducts());
        return categoryRepository.save(existingCategory);

    }
}
