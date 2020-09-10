package Lesson2.controller;

import Lesson2.domain.Product;
import Lesson2.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteProductById(@RequestParam(name = "id") long id) {
        productService.removeById(id);
        return "redirect:/product/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(Model model, @PathVariable("id") Long id) {
        Product byId = productService.getById(id);
        model.addAttribute("product",
                byId == null ? new Product() : byId);
        return "product";
    }

    @GetMapping("/add")
    public String getFormNewProduct(Model model) {
        model.addAttribute("product", new Product());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewProduct(Product product) {
        Product savedProduct = productService.save(product);
        System.out.println(savedProduct);
        return "redirect:/product/" + savedProduct.getId();
    }

}
