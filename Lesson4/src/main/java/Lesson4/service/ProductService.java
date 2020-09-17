package Lesson4.service;

import Lesson4.domain.Product;
import Lesson4.repository.ProductRepoJPA;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepoJPA productrepo;

    public ProductService(ProductRepoJPA productrepo) {
        this.productrepo=productrepo;
    }

    @Transactional
    public void saveAndSet(Product product, String name, float price){
        product.setName(name);
        product.setPrice(price);
        productrepo.save(product);
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productrepo.findAll();
    }

    @Transactional (readOnly = true)
    public Product getMaxPrice() {
        return productrepo.findFirst1ByPriceOrderByPriceDesc();
    }

    @Transactional (readOnly = true)
    public Product getMinPrice() {
        return productrepo.findFirst1ByPriceOrderByPriceAsc();
    }

}
