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
@Table(name = "reservation_type")
@SQLDelete(sql = "update article set deleted=true where id=?")
@Where(clause = "deleted = false")
public class ReservationType implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "reservation_type", nullable = false)
    private String reservation_type;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
