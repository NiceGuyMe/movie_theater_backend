package com.example.movie_theater.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@SQLDelete(sql = "update article set deleted=true where id=?")
@Where(clause = "deleted = false")
@Table(name = "auditorium")
public class Auditorium implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "seats_no", nullable = false)
    private int seatsNo;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
