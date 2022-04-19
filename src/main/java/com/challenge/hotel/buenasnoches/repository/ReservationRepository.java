package com.challenge.hotel.buenasnoches.repository;

import com.challenge.hotel.buenasnoches.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
