package com.kayan.hotel_corinthians_backend.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class ReservationRequest(
    val roomId: Long,
    val guestName: String,
    val guestEmail: String,
    val checkIn: LocalDateTime,
    val checkOut: LocalDateTime,
    val baseRate: BigDecimal,
    val currency: String = "BRL",
    val isNearEvent: Boolean = false
)