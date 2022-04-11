package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.GuestResponse;
import com.challenge.hotel.buenasnoches.model.Guest;
import com.challenge.hotel.buenasnoches.repository.GuestRepository;
import com.challenge.hotel.buenasnoches.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements IGuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public GuestResponse getGuest() {
        List<Guest> guests = guestRepository.findAll();
        return GuestResponse.builder().errors(Collections.emptyList()).guests(guests).build();
    }

    @Override
    public Guest addGuest(Guest guest) {
        System.out.println(guest.toString());
        return guestRepository.save(guest);
    }

    @Override
    public void deleteGuest(Integer id, Guest guest) {
        Optional<Guest> result = guestRepository.findById(id);
        if( result.isPresent() )
            guestRepository.delete(guest);
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public Guest updateGuest(Integer id, Guest guest) {
        Optional<Guest> result = guestRepository.findById(id);
        if( result.isPresent() )
            return guestRepository.save(guest);
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}
