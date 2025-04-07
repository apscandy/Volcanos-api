package com.andyslabs.volcano.api_server.controller.volcano;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VolcanoController implements VolcanoEndpoints {

    @Override
    @GetMapping("/countries")
    public void getCountries() {
        System.out.println("Countries");

    }

    @Override
    @GetMapping("/volcano/{id}")
    public void getVolcanoById(@PathVariable int id) {
        System.out.println("Volcano " + id);

    }

    @Override
    @GetMapping("/volcanoes")
    public void getVolcanoes() {
        System.out.println("Volcanoes");
    }
}
