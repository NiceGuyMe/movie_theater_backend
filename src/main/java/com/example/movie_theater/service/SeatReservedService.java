package com.example.movie_theater.service;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.SeatReserved;
import com.example.movie_theater.repository.SeatReservedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class SeatReservedService {

    private final SeatReservedRepository seatReservedRepository;

    public Optional<SeatReserved> getById(int seatReservedId) {
        return seatReservedRepository.findById(seatReservedId);
    }
    public List<SeatReserved> getAll() {
        return seatReservedRepository.findAll();
    }

    public void delete(int seat){
        seatReservedRepository.deleteById(seat);
    }

    public List<SeatReserved> save(List<SeatReserved> seatReserved) {
        return seatReservedRepository.saveAll(seatReserved);
    }
}
