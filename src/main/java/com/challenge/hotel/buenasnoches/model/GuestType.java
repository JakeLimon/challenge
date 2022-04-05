package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table( name = "guest_type" )
public class GuestType {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer number;
    private String name;

}
