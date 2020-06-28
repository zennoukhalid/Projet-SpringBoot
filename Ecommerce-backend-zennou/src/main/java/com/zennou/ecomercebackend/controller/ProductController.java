package com.zennou.ecomercebackend.controller;

import com.zennou.ecomercebackend.entity.Product;
import com.zennou.ecomercebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @CrossOrigin
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @CrossOrigin
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }
    @CrossOrigin
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    @CrossOrigin
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @CrossOrigin
    @GetMapping("/product/title/{title}")
    public Product findProductByName(@PathVariable String title) {
        return productService.getProductByTitle(title);
    }

    @CrossOrigin
    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @CrossOrigin
    @DeleteMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
