package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "room" )
public class Room {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    private String name;
    private String description;
    private Integer floor;
    @Column( name = "max_guest" )
    private Integer maxGuest;

    @OneToOne
    @JoinColumn( name = "room_type", referencedColumnName = "id")
    private RoomType roomType;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Reservation reservation;

}
