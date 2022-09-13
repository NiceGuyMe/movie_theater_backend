package com.example.movie_theater.controller;

import com.example.movie_theater.model.Screening;
import com.example.movie_theater.model.Seat;
import com.example.movie_theater.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class SeatController {
    private final SeatService seatService;
    @GetMapping("seats/")
    public List<Seat> getAllSeat(){
        return seatService.getAll();
    }
    @GetMapping("seats/{seatId}")
    public Optional<Seat> getSeatByID(@PathVariable("seatId") int seatId){
        return seatService.getById(seatId);
    }
    @DeleteMapping("seats/{seatId}")
    public void deleteSeatById(@PathVariable("seatId") int seatId){
        seatService.delete(seatId);
    }

    @PutMapping("seats/")
    public List<Seat> createOrUpdateSeats(@RequestBody List<Seat> seat){
        return seatService.save(seat);
    }
}
