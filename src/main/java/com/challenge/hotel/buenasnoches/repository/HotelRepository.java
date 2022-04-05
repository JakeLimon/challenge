package com.challenge.hotel.buenasnoches.repository;

import com.challenge.hotel.buenasnoches.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
