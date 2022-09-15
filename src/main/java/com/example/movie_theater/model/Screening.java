package com.example.movie_theater.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

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
@SQLDelete(sql = "update article set deleted=true where id=?")
@Where(clause = "deleted = false")

public class Screening implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name = "auditorium_id")
   private Auditorium auditorium;

    @Column(name = "screening_start", nullable = false)
    private Date screeningStart;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
