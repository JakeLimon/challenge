package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "room_type" )
public class RoomType {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
