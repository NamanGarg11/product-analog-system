package org.naman.productanalogsystem.repository;

import org.naman.productanalogsystem.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
    List<Product> findByCategory(String category);
}

