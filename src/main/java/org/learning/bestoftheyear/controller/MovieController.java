package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {


    @GetMapping
    public String movies(Model model){
        List<Movie> moviesList = getMovies();
        String movies = "";
        for (Movie m : moviesList){
            movies += m.getName() + ", ";
        }
        movies = movies.substring(0, movies.length() - 2);
        model.addAttribute("moviesList", movies);
        return movies;
    }

    private List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Imitation Game", 8));
        movies.add(new Movie("Avatar", 4));
        return movies;
    }
}
