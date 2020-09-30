package Lesson7and8.service;

import Lesson7and8.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(Long id);

    Product save(Product product);

    void removeProductById(Long id);
}