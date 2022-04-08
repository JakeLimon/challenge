package com.challenge.hotel.buenasnoches.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table( name = "bitacora_reservaciones")
public class BitacoraReservaciones implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "hotel_name" )
    private String hotelName;
    @Column( name = "room_name")
    private String roomName;
    @Column( name = "guest_first_name" )
    private String guestFirstName;
    @Column( name = "guest_last_name" )
    private String guestLastName;
    @Column( name = "guest_email" )
    private String guestEmail;
    @Column( name = "start_date")
    private LocalDate startDate;
    @Column( name = "end_date" )
    private LocalDate endDate;

}
