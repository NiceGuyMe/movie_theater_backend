package com.example.movie_theater.controller;

import com.example.movie_theater.model.Auditorium;
import com.example.movie_theater.service.AuditoriumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AuditoriumController {

    private final AuditoriumService auditoriumService;
    @GetMapping("auditoriums/{auditoriumId}")
    public Optional<Auditorium> getAuditoriumByID(@PathVariable("auditoriumId") int auditoriumId) {
        return auditoriumService.getById(auditoriumId);
    }

    @GetMapping("auditoriums/")
    public List<Auditorium> getAllAuditorium() {
        return auditoriumService.getAll();
    }

    @PutMapping("auditoriums/")
    public List<Auditorium> createOrUpdateAuditorium(@RequestBody List<Auditorium> auditorium) {
        return auditoriumService.saveAll(auditorium);
    }

    @DeleteMapping("auditoriums/{auditoriumId}")
    public void deleteAuditoriumById(@PathVariable("auditoriumId") int auditoriumId) {
        auditoriumService.delete(auditoriumId);
    }

}
