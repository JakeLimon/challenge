package com.challenge.hotel.buenasnoches.controllers;

import com.challenge.hotel.buenasnoches.dto.RoomResponse;
import com.challenge.hotel.buenasnoches.model.Room;
import com.challenge.hotel.buenasnoches.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private IRoomService roomService;

    @GetMapping
    public ResponseEntity<RoomResponse> getRooms(){
        return new ResponseEntity<RoomResponse>(roomService.getRooms(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Room> postRoom(@RequestBody Room room ){
        return new ResponseEntity<Room>(roomService.addRoom(room), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> putRoom(@PathVariable("id") Integer id, @RequestBody Room room){
        return new ResponseEntity<Room>(roomService.updateRoom(id, room), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable("id") Integer id, @RequestBody Room room){
        roomService.deleteRoom(id, room);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
