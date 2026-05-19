package com.kayan.hotel_corinthians_backend.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "rooms")
data class Room(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val number: String,

    @Column(nullable = false)
    val type: String,

    @Column(name = "base_rate", nullable = false)
    val baseRate: BigDecimal,

    @Column(nullable = false)
    val available: Boolean = true
)