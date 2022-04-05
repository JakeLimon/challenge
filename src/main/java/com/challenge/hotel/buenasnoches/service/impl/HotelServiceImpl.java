package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.HotelResponse;
import com.challenge.hotel.buenasnoches.model.Hotel;
import com.challenge.hotel.buenasnoches.repository.HotelRepository;
import com.challenge.hotel.buenasnoches.service.IHotelService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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

    private List<Hotel> getAllHotel(){
       log.info("Getting Hotels list....");
       return hotelRepository.findAll();
    }


}
