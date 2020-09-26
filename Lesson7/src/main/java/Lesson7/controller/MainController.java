package Lesson7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Получить список продуктов, посмотреть продукт детально,
    // добавить в базу и удалить продукты из базы

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("testtext", "fdsa");
        model.addAttribute("title", "Index Title");
        return "index";
    }

    @GetMapping("/tmp")
    public String tmp(Model model){
        model.addAttribute("testtext", "TMP");
        model.addAttribute("title", "Index Title");
        return "index";
    }
}
