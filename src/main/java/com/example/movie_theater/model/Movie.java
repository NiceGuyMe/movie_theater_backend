package com.example.movie_theater.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "movie")
@SQLDelete(sql = "update article set deleted=true where id=?")
@Where(clause = "deleted = false")
public class Movie implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "casting")
    private String casting;

    @Column(name = "description")
    private String description;

    @Column(name = "duration_min")
    private int durationMin;


    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
