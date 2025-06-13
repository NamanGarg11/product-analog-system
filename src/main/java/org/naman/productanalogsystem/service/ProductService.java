package org.naman.productanalogsystem.service;

import jakarta.annotation.PostConstruct;
import org.naman.productanalogsystem.model.Product;
import org.naman.productanalogsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepository;

    @PostConstruct
    public void initData() {
        if (productrepository.count() == 0) {
            productrepository.save(new Product("Laptop", "Electronics", 55000.0, 10));
            productrepository.save(new Product("Mobile Phone", "Electronics", 15000.0, 25));
            productrepository.save(new Product("Notebook", "Stationery", 50.0, 200));
            productrepository.save(new Product("Pen", "Stationery", 10.0, 500));
        }
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productrepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productrepository.findById(id);
    }

    public Product addProduct(Product product) {
        return productrepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productrepository.save(product);
    }

    public void deleteProduct(Long id) {
        productrepository.deleteById(id);
    }

    // Newly Added - Retrieve by category
    public List<Product> getProductsByCategory(String category) {
        return productrepository.findByCategory(category);
    }
}


