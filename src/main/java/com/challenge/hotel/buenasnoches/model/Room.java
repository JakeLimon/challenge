package com.challenge.hotel.buenasnoches.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table( name = "room" )
public class Room implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;
    private String name;
    private String description;
    private Integer floor;
    @Column( name = "max_guest" )
    private Integer maxGuest;

    @JsonIgnore
    @OneToOne
    @JoinColumn( name = "room_type", referencedColumnName = "id")
    private RoomType roomType;

    @JsonIgnore
    @ManyToOne( fetch = FetchType.LAZY )
    private Hotel hotel;

    @JsonIgnore
    @ManyToOne( fetch = FetchType.LAZY )
    private Reservation reservation;

}
