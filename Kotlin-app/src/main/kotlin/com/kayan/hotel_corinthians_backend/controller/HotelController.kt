package com.kayan.hotel_corinthians_backend.controller

import com.kayan.hotel_corinthians_backend.dto.ReservationRequest
import com.kayan.hotel_corinthians_backend.security.service.ReservationService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/hotel")
@Tag(name = "Hotel", description = "Rotas principais do sistema de hotel")
class HotelController(
    private val reservationService: ReservationService
) {

    @GetMapping("/boas-vindas")
    @Operation(summary = "Testar API", description = "Verifica se o backend está online")
    fun boasVindas() =
        mapOf("mensagem" to "🏨 Bem-vindo ao Sistema do Hotel Corinthians! Backend Online.")

    @PostMapping("/reservar")
    @Operation(summary = "Criar reserva", description = "Cria uma nova reserva no sistema")
    fun reservarQuarto(@RequestBody request: ReservationRequest): ResponseEntity<Any> {
        return try {
            val reservation = reservationService.createReservation(request)
            ResponseEntity.ok(reservation)
        } catch (e: Exception) {
            ResponseEntity.badRequest().body(mapOf("erro" to (e.message ?: "Erro desconhecido")))
        }
    }
}