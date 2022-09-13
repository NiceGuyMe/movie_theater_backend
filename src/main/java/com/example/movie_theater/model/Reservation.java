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

    @Column(name = "screening_id", nullable = false)
    private int screeningId;

    @Column(name = "employee_reserved_id")
    private int employeeReservedId;

    @Column(name = "reservation_type_id")
    private int reservationTypeId;

    @Column(name = "reservation_contact", nullable = false)
    private String reservationContact;

    @Column(name = "reserved")
    private Boolean reserved;

    @Column(name = "employee_paid_id")
    private int employeePaidId;

    @Column(name = "paid")
    private Boolean paid;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
