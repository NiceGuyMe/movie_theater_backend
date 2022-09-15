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

   @ManyToOne
   @JoinColumn(name = "seat_id")
   private Seat seat_id;

   @ManyToOne
   @JoinColumn(name = "reservation_id")
   private Reservation reservation_id;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening_id;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
