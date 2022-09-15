package com.example.movie_theater.repository;

import com.example.movie_theater.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,Integer>{
}