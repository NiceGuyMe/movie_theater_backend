package com.example.movie_theater.controller;

import com.example.movie_theater.model.Reservation;
import com.example.movie_theater.model.ReservationType;
import com.example.movie_theater.service.ReservationTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationTypeController {
    private final ReservationTypeService reservationTypeService;
    @GetMapping("reservationTypes/")
    public List<ReservationType> getAllReservationType(){
        return reservationTypeService.getAll();
    }

    @GetMapping("reservationTypes/{reservationTypeId}")
    public Optional<ReservationType> getReservationTypeByID(@PathVariable("reservationTypeId") int reservationTypeId) {
        return reservationTypeService.getById(reservationTypeId);
    }
    @DeleteMapping("reservationTypes/{reservationTypeId}")
    public void deleteReservationTypeById(@PathVariable("reservationTypeId") int reservationTypeId){
        reservationTypeService.delete(reservationTypeId);
    }

    @PutMapping("reservationTypes/")
    public ReservationType createOrUpdateReservationTypes(@RequestBody ReservationType reservationType){
        return reservationTypeService.save(reservationType);
    }
}
