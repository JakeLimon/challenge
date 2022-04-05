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
    // private RoomType roomType;
    // private Hotel hotel;

}
