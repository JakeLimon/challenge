package com.challenge.hotel.buenasnoches.controllers;

import com.challenge.hotel.buenasnoches.dto.HotelResponse;
import com.challenge.hotel.buenasnoches.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class Hotel {

    @Autowired
    private IHotelService hotelService;

    @GetMapping
    public ResponseEntity<HotelResponse> getHotels(){
        return new ResponseEntity<HotelResponse>(hotelService.getHotels(), HttpStatus.OK);
    }

}
