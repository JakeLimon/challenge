package com.challenge.hotel.buenasnoches.service.impl;

import com.challenge.hotel.buenasnoches.dto.RoomResponse;
import com.challenge.hotel.buenasnoches.model.Room;
import com.challenge.hotel.buenasnoches.repository.RoomRepository;
import com.challenge.hotel.buenasnoches.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements IRoomService {

    @Autowired
    private RoomRepository roomRepository;

    public RoomResponse getRooms(){
        List<Room> rooms = roomRepository.findAll();
        return RoomResponse.builder().errors(Collections.emptyList())
                .rooms(rooms).build();
    }

    @Override
    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room updateRoom(Integer id, Room room) {
        Optional<Room> result = roomRepository.findById(id);
        if( result.isPresent() )
            return roomRepository.save(room);
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public void deleteRoom(Integer id, Room room) {
        Optional<Room> result = roomRepository.findById(id);
        if( result.isPresent() )
            roomRepository.delete(room);
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}
