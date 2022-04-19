package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.ReservationResponse;
import com.challenge.hotel.buenasnoches.model.Reservation;
import com.challenge.hotel.buenasnoches.repository.ReservationRepository;
import com.challenge.hotel.buenasnoches.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

//    @Override
//    public ReservationResponse getReservations(Integer idGuest) {
//        // Tener en cuenta las relaciones de las tablas ya que estoy estudiando JPA esta parte cambiara
//        List<Reservation> reservation = reservationRepository.findAll();
//        return ReservationResponse.builder().errors(Collections.emptyList()).reservation(reservation).build();
//    }

    @Override
    public ReservationResponse getReservations() {
        // Tener en cuenta las relaciones de las tablas ya que estoy estudiando JPA esta parte cambiara
        List<Reservation> reservation = reservationRepository.findAll();
        return ReservationResponse.builder().errors(Collections.emptyList()).reservation(reservation).build();
    }

}
