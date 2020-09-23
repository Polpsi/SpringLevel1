package Lesson6.service;

import Lesson6.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(Long id);

    Product save(Product product);

    void removeProductById(Long id);
}