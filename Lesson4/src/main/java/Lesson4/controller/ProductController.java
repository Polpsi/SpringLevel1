package Lesson4.controller;

import Lesson4.domain.Product;
import Lesson4.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController (ProductService productService) {
        this.productService=productService;
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping("/maxminprice")
    public String maxprice(Model model) {
        Product product = productService.getMaxPrice();
        model.addAttribute("productMax", product);
        product = productService.getMinPrice();
        model.addAttribute("productMin", product);
        return "maxminprice";
    }
}
