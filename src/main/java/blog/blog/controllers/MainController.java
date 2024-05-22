package blog.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
    @GetMapping("/")
    public String MainPage(Model model) {
        return "test";
    }
    @GetMapping("/about")
    public String About(Model model) {
        return "test";
    }

}
