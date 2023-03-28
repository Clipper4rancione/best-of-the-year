package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("name", "Ciro");
        return "home";
    }

}
