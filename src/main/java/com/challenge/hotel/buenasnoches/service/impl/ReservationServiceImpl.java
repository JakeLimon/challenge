package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.ReservationResponse;
import com.challenge.hotel.buenasnoches.model.Guest;
import com.challenge.hotel.buenasnoches.service.IReservationService;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService {

    @Override
    public ReservationResponse getReservations(Integer id, Guest guest) {
        return null;
    }
}
