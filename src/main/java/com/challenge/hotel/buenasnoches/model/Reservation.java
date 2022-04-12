package com.challenge.hotel.buenasnoches.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
