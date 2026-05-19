package com.kayan.hotel_corinthians_backend.state

import com.kayan.hotel_corinthians_backend.model.Client
import com.kayan.hotel_corinthians_backend.model.Employee
import com.kayan.hotel_corinthians_backend.model.Room

object HotelState {
    const val hotelName: String = "Hotel Corinthians"

    val clientList = mutableListOf<Client>()
    val employeeList = mutableListOf<Employee>()

    val roomList = mutableListOf<Room>()

    val occupiedSalonDates = mutableSetOf<String>()
}