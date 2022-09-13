package com.example.movie_theater.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "seat_reserved")
public class SeatReserved implements Serializable{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "seat_id", nullable = false)
    private int seatId;

    @Column(name = "reservation_id", nullable = false)
    private int reservationId;

    @Column(name = "screening_id", nullable = false)
    private int screeningId;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
