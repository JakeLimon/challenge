package com.challenge.hotel.buenasnoches.controllers;

import com.challenge.hotel.buenasnoches.dto.HotelResponse;
import com.challenge.hotel.buenasnoches.model.Hotel;
import com.challenge.hotel.buenasnoches.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @GetMapping
    public ResponseEntity<HotelResponse> getHotels(){
        return new ResponseEntity<HotelResponse>(hotelService.getHotels(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hotel> postHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<Hotel>(hotelService.postHotel(hotel), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable("id") Integer id){
        hotelService.deleteHotel(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
