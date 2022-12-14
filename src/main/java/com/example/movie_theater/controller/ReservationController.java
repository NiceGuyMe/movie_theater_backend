package com.example.movie_theater.controller;

import com.example.movie_theater.model.Movie;
import com.example.movie_theater.model.Reservation;
import com.example.movie_theater.service.ReservationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationController {

    private final ReservationService reservationService;
    @GetMapping("reservations/")
    public List<Reservation> getAllReservation(){
        return reservationService.getAll();
    }

    @GetMapping("reservations/{reservationId}")
    public Optional<Reservation> getReservationByID(@PathVariable("reservationId") int reservationId) {
        return reservationService.getById(reservationId);
    }
    @DeleteMapping("reservations/{reservationId}")
    public void deleteReservationById(@PathVariable("reservationId") int reservationId){
        reservationService.delete(reservationId);
    }

    @PutMapping("reservations/")
    public Reservation createOrUpdateReservation(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }
}
