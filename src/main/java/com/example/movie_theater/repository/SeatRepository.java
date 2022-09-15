package com.example.movie_theater.repository;

import com.example.movie_theater.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}