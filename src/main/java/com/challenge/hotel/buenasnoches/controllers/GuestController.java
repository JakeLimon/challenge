package com.challenge.hotel.buenasnoches.controllers;

import com.challenge.hotel.buenasnoches.dto.GuestResponse;
import com.challenge.hotel.buenasnoches.model.Guest;
import com.challenge.hotel.buenasnoches.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private IGuestService guestService;

    @GetMapping
    public ResponseEntity<GuestResponse> getGuests(){
        return new ResponseEntity<GuestResponse>(guestService.getGuest(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Guest> PostGuest(@RequestBody Guest guest){
        return new ResponseEntity<Guest>(guestService.addGuest(guest), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuest( @PathVariable("id") Integer id, @RequestBody Guest guest ){
        guestService.deleteGuest(id, guest);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guest> updateGuest( @PathVariable("id") Integer id, @RequestBody Guest guest){
        return new ResponseEntity<Guest>(guestService.updateGuest(id, guest), HttpStatus.CREATED);
    }

}
