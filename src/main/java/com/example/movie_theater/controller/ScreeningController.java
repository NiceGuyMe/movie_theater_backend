package com.example.movie_theater.controller;

import com.example.movie_theater.model.ReservationType;
import com.example.movie_theater.model.Screening;
import com.example.movie_theater.service.ScreeningService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController

public class ScreeningController {

    private final ScreeningService screeningService;

    @GetMapping("screenings/{screeningID}")
    public Optional<Screening> getScreeningByID(@PathVariable("screeningID") int screeningID) {
        return screeningService.getById(screeningID);
    }

    @GetMapping("screenings/")
    public List<Screening> getAllScreening() {
        return screeningService.getAll();
    }

    @DeleteMapping("screenings/{screeningID}")
    public void deleteScreeningById(@PathVariable("screeningID") int screeningID){
        screeningService.delete(screeningID);
    }

    @PutMapping("screenings/")
    public List<Screening> createOrUpdateScreenings(@RequestBody List<Screening> screening){
        return screeningService.save(screening);
    }
}
