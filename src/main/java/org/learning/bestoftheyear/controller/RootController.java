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

    @GetMapping("/movies")
    public String movies(Model model){
        List<Movie> list = getMovies();
        String movies = "";
        for (Movie m : list){
            movies += m.getName() + ", ";
        }
        model.addAttribute("movies", movies);
        return movies;
    }

    private List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Imitation Game", 8));
        movies.add(new Movie("Avatar", 4));
        return movies;
    }
}
