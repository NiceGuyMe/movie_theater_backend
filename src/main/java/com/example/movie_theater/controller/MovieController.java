package com.example.movie_theater.controller;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MovieController {
    private final MovieService movieService;

    @GetMapping("movies/{movieId}")
    public Optional<Movie> getMovieByID(@PathVariable("movieId") int movieId) {
        return movieService.getById(movieId);
    }

    @GetMapping("movies/")
    public List<Movie> getAllMovie() {
        return movieService.getAll();
    }

    @DeleteMapping("movies/{movieId}")
    public void deleteMovieById(@PathVariable("movieId") int movieId) {
        movieService.delete(movieId);
    }

    @PutMapping("movies/")
    public List<Movie> createOrUpdateMovie(@RequestBody List<Movie> movie) {
        return movieService.save(movie);
    }

}
