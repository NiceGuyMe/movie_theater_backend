package com.example.movie_theater.controller;

import com.example.movie_theater.model.Seat;
import com.example.movie_theater.model.SeatReserved;
import com.example.movie_theater.service.SeatReservedService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class SeatReservedController {
    private final SeatReservedService seatReservedService;
    @GetMapping("seatReserveds/")
    public List<SeatReserved> getAllSeatReserved(){
        return seatReservedService.getAll();
    }
    @GetMapping("seatReserveds/{seatReservedId}")
    public Optional<SeatReserved> getSeatReservedByID(@PathVariable("seatReservedId") int seatReservedId){
        return seatReservedService.getById(seatReservedId);
    }
    @DeleteMapping("seatReserveds/{seatReservedId}")
    public void deleteSeatReservedById(@PathVariable("seatReservedId") int seatReservedId){
        seatReservedService.delete(seatReservedId);
    }

    @PutMapping("seatReserveds/")
    public SeatReserved createOrUpdateSeatReserved(@RequestBody SeatReserved seatReserved){
        return seatReservedService.save(seatReserved);
    }
}
