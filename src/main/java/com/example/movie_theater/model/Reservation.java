package com.example.movie_theater.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening_id;

    @ManyToOne
    @JoinColumn(name = "employee_reserved_id")
    private Employee employee_reserved_id;

    @ManyToOne
    @JoinColumn(name = "reservation_type_id")
    private ReservationType reservation_type_id;

    @Column(name = "reservation_contact", nullable = false)
    private String reservation_contact;

    @Column(name = "reserved")
    private Boolean reserved;

    @ManyToOne
    @JoinColumn(name = "employee_paid_paid_id")
    private Employee employee_paid_paid_id;

    @Column(name = "paid")
    private Boolean paid;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
