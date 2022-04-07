package com.challenge.hotel.buenasnoches.service;

import com.challenge.hotel.buenasnoches.dto.HotelResponse;
import com.challenge.hotel.buenasnoches.model.Hotel;

public interface IHotelService {

    HotelResponse getHotels();
    Hotel postHotel(Hotel hotel);
    void deleteHotel(Integer id);
    Hotel updateHotel(Integer id, Hotel hotel);

}
