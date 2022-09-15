package com.example.movie_theater.service;

import com.example.movie_theater.model.Employee;
import com.example.movie_theater.model.Movie;
import com.example.movie_theater.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    private  final MovieRepository movieRepository;

    public Optional<Movie> getById(int MovieId) {
        return movieRepository.findById(MovieId);
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public void delete(int movie){
        movieRepository.deleteById(movie);
    }

}
