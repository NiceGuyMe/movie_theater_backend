package com.example.movie_theater.service;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.Reservation;
import com.example.movie_theater.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getById(int reservationId) {
        return reservationRepository.findById(reservationId);
    }

    public void delete(int reservation){
        reservationRepository.deleteById(reservation);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

}
