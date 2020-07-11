package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model) {
        Car car1 = new Car("e46", "bmw");
        Car car2 = new Car("e", "b");
        Car car3 = new Car("3", "m");
        Car car4 = new Car("6", "w");
        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        model.addAttribute("cars", cars);
        return "hello";
    }
}
