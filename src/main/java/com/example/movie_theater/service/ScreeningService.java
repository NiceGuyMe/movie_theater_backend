package com.example.movie_theater.service;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.Screening;
import com.example.movie_theater.repository.ScreeningRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public Optional<Screening> getById(int screeningId) {
        return screeningRepository.findById(screeningId);
    }

    public List<Screening> getAll() {
        return screeningRepository.findAll();
    }

    public void delete(int screening){
        screeningRepository.deleteById(screening);
    }

    public Screening  save(Screening screening) {
        return screeningRepository.save(screening);
    }


}
