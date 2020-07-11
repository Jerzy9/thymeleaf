package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model) {
        Car car = new Car("e46", "bmw");
        model.addAttribute("car", car);
        return "hello";
    }
}
