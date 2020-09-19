package controller;

import domain.Product;
import org.springframework.web.bind.annotation.ModelAttribute;
import repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductContr {
    private List<Product> products =new ArrayList<>();

    @ModelAttribute("products")
    public List<Product> getProducts() {
        return
    }
}
