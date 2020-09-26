package Lesson7.controller;

import Lesson7.domain.Product;
import Lesson7.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getProductById(Model model, @PathVariable("id") Long id){
        model.addAttribute("product", productService.getById(id));
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
        System.out.println(savedProduct.getId());
        return "redirect:/product/" + savedProduct.getId()+"/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteProductById(@RequestParam(name = "id") long id) {
        productService.removeProductById(id);
        return "redirect:/product/list";
    }

}
