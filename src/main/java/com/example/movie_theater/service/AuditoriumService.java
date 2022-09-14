package com.example.movie_theater.service;

import com.example.movie_theater.model.Auditorium;
import com.example.movie_theater.repository.AuditoriumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor

public class AuditoriumService {
    private final AuditoriumRepository auditoriumRepository;

    public List<Auditorium> getAll() {
        return auditoriumRepository.findAll();
    }

    public Auditorium save(Auditorium auditoriums) {
        return auditoriumRepository.save(auditoriums);
    }


    public Optional<Auditorium> getById(int auditoriumId) {
        return auditoriumRepository.findById(auditoriumId);
    }

    public void delete(int auditorium){
        auditoriumRepository.deleteById(auditorium);
    }
}
