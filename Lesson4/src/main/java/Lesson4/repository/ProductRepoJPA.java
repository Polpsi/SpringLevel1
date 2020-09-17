package Lesson4.repository;

import Lesson4.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepoJPA extends JpaRepository<Product, Long> {
    Product findFirst1ByPriceOrderByPriceAsc();
    Product findFirst1ByPriceOrderByPriceDesc();
    List<Product> findAll();
}
