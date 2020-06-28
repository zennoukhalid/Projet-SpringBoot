package com.zennou.ecomercebackend.service;

import com.zennou.ecomercebackend.entity.Product;
import com.zennou.ecomercebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByTitle(String name) {
        return productRepository.findByTitle(name);
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product removed: "+id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setTitle(product.getTitle());
        existingProduct.setStock(product.getStock());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setPhotoURL(product.getPhotoURL());
        return productRepository.save(existingProduct);

    }
}
