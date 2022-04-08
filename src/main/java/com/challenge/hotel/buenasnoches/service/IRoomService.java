package com.challenge.hotel.buenasnoches.service;

import com.challenge.hotel.buenasnoches.dto.RoomResponse;
import com.challenge.hotel.buenasnoches.model.Room;

public interface IRoomService {

    RoomResponse getRooms();
    Room addRoom(Room room);
    Room updateRoom(Integer id, Room room);
    void deleteRoom(Integer id, Room room);

}
