package com.example.movie_theater.service;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.ReservationType;
import com.example.movie_theater.repository.ReservationTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationTypeService {

    private final ReservationTypeRepository reservationTypeRepository;

    public Optional<ReservationType> getById(int reservationTypeId) {
        return reservationTypeRepository.findById(reservationTypeId);
    }
    public List<ReservationType> getAll() {
        return reservationTypeRepository.findAll();
    }

    public void delete(int reservationType){
        reservationTypeRepository.deleteById(reservationType);
    }

    public List<ReservationType> save(List<ReservationType> reservationType) {
        return reservationTypeRepository.saveAll(reservationType);
    }
}
