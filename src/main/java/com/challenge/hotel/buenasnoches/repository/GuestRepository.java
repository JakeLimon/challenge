package com.challenge.hotel.buenasnoches.repository;

import com.challenge.hotel.buenasnoches.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {

}
