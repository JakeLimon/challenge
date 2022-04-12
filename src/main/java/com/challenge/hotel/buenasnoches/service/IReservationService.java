package com.challenge.hotel.buenasnoches.service;


import com.challenge.hotel.buenasnoches.dto.ReservationResponse;
import com.challenge.hotel.buenasnoches.model.Guest;

public interface IReservationService {

    ReservationResponse getReservations(Integer id, Guest guest);

}
