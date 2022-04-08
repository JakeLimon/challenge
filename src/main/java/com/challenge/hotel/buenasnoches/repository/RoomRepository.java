package com.challenge.hotel.buenasnoches.repository;

import com.challenge.hotel.buenasnoches.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
