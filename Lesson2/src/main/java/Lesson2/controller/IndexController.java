package Lesson2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class IndexController {

    //Создание ссылок на карточку товара и удаление в шаблоне list.html
    //Метод удаления вынес наверх в ProductController.
    //Остальное практически идентично написанному на уроке (подглядывал, что-то копировал)

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", "/product/list");
        model.addAttribute("add", "/product/add");
        return "index";
    }
}