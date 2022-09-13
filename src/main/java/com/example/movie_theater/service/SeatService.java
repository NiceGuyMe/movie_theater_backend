package com.example.movie_theater.service;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.Seat;
import com.example.movie_theater.repository.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SeatService {
    private final SeatRepository seatRepository;

    public Optional<Seat> getById(int seatId) {
        return seatRepository.findById(seatId);
    }
    public List<Seat> getAll() {
        return seatRepository.findAll();
    }

    public void delete(int seat){
        seatRepository.deleteById(seat);
    }

    public List<Seat> save(List<Seat> seat) {
        return seatRepository.saveAll(seat);
    }
}
