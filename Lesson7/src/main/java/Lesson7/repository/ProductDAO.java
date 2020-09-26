package Lesson7.repository;

import Lesson7.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository <Product,Long> {
    List<Product> findAll();
    void deleteById(Long id);
}
