package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table( name = "guest")
public class Guest implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "first_name" )
    private String firstName;
    @Column( name = "last_name" )
    private String lastName;
    @Column( name = "email")
    private String email;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinColumn( name = "guest_type", referencedColumnName = "id")
    private GuestType guestType;

    @ManyToOne
    private Reservation reservation;

}
