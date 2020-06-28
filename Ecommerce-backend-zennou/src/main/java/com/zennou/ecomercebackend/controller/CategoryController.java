package com.zennou.ecomercebackend.controller;

import com.zennou.ecomercebackend.entity.Category;
import com.zennou.ecomercebackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @CrossOrigin
    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category product) {
        return categoryService.saveCategory(product);
    }

    @CrossOrigin
    @PostMapping("/addCategories")
    public List<Category> addCategories(@RequestBody List<Category> products) {
        return categoryService.saveCategories(products);
    }

    @CrossOrigin
    @GetMapping("/categories")
    public List<Category> findAllCategories() {
        return categoryService.getCategories();
    }

    @CrossOrigin
    @GetMapping("/category/{id}")
    public Category findCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @CrossOrigin
    @GetMapping("/category/name/{name}")
    public Category findCategoryByName(@PathVariable String name) {
        return categoryService.getCategoryByName(name);
    }

    @CrossOrigin
    @PutMapping("/category/update")
    public Category updateCategory(@RequestBody Category product) {
        return categoryService.updateProduct(product);
    }

    @CrossOrigin
    @DeleteMapping("/category/delete/{id}")
    public String deleteCategory(@PathVariable int id) {
        return categoryService.deleteCategory(id);
    }
}
