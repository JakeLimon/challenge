package com.challenge.hotel.buenasnoches.service;

import com.challenge.hotel.buenasnoches.dto.GuestResponse;
import com.challenge.hotel.buenasnoches.model.Guest;

public interface IGuestService {

    GuestResponse getGuest();
    Guest addGuest(Guest guest);
    void deleteGuest(Integer id, Guest guest);
    Guest updateGuest(Integer id, Guest guest);
}
