package com.kayan.hotel_corinthians_backend.controller

import com.kayan.hotel_corinthians_backend.model.Room
import com.kayan.hotel_corinthians_backend.state.HotelState
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rooms")
class RoomController {

    @PostMapping
    fun addRoom(@RequestBody room: Room): String {
        HotelState.roomList.add(room)
        return "Quarto adicionado com sucesso: ${room.number}"
    }

    @GetMapping
    fun getAllRooms(): List<Room> {
        return HotelState.roomList
    }

    @GetMapping("/{id}")
    fun getRoomById(@PathVariable id: Long): Room? {
        return HotelState.roomList.find { it.id == id }
    }
}