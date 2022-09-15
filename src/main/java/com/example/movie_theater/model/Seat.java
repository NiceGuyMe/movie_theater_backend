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
@Table(name = "seat")
@SQLDelete(sql = "update article set deleted=true where id=?")
@Where(clause = "deleted = false")
public class Seat  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "row", nullable = false)
    private int row;

    @Column(name = "number", nullable = false)
    private int number;

   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name = "auditorium_id")
   private Auditorium auditorium;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
