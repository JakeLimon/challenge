package com.challenge.hotel.buenasnoches.model;

import javax.persistence.*;

@Entity
@Table( name = "hotel" )
public class Hotel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer stars;

}
