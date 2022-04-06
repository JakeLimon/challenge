package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "hotel" )
@Data
public class Hotel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer stars;

}
