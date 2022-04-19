package com.challenge.hotel.buenasnoches.controllers;

import com.challenge.hotel.buenasnoches.dto.ReservationResponse;
import com.challenge.hotel.buenasnoches.service.impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationServiceImpl reservationService;

//    @GetMapping("/{id}")
//    public ResponseEntity<ReservationResponse> getReservations(@PathVariable("id") Integer id){
//        return new ResponseEntity<ReservationResponse>(reservationService.getReservations(id), HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<ReservationResponse> getReservations(){
        return new ResponseEntity<ReservationResponse>(reservationService.getReservations(), HttpStatus.OK);
    }

}
