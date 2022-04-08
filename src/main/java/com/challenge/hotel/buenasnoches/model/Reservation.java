package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table( name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany( mappedBy = "reservation")
    private List<Room> rooms;

    @OneToMany( mappedBy = "reservation")
    private List<Guest> guests;

    @Column( name = "start_date" )
    private LocalDate startDate;
    @Column( name = "end_date" )
    private LocalDate endDate;
    @Column( name = "check_in" )
    private Boolean checkIn;
    @Column( name = "check_out" )
    private Boolean checkOut;

}
