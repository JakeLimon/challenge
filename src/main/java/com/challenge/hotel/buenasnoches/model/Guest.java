package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table( name = "guest")
public class Guest {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "first_name" )
    private String firstName;
    @Column( name = "last_name" )
    private String lastName;
    @Column( name = "email")
    private String email;
    //@Column( mame = "guest_type" )
    //private GuestType guestType;

}
