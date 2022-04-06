package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.HotelResponse;
import com.challenge.hotel.buenasnoches.model.Hotel;
import com.challenge.hotel.buenasnoches.repository.HotelRepository;
import com.challenge.hotel.buenasnoches.service.IHotelService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class HotelServiceImpl implements IHotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public HotelResponse getHotels() {
        List<Hotel> hotels = getAllHotel();
        return HotelResponse.builder()
                .errors(Collections.emptyList())
                .hotels(hotels)
                .build();
    }

    @Override
    public Hotel postHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Integer id) {
        Hotel hotelToDelete = getHotelById(id);
        hotelRepository.delete(hotelToDelete);
    }

    private List<Hotel> getAllHotel(){
       log.info("Getting Hotels list....");
       return hotelRepository.findAll();
    }

    private Hotel getHotelById(Integer id){
        Optional<Hotel> result = hotelRepository.findById(id);
        if( result.isPresent() )
            return result.get();
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }


}
