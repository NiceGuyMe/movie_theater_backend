package com.example.movie_theater.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "screening")
public class Screening implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "movie_id", nullable = false)
    private int movieId;

    @Column(name = "auditorium_id", nullable = false)
    private int auditoriumId;

    @Column(name = "screening_start", nullable = false)
    private Date screeningStart;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
