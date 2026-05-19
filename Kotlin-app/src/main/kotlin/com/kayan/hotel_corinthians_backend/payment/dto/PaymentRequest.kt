package com.kayan.hotel_corinthians_backend.payment.dto

import com.kayan.hotel_corinthians_backend.payment.model.PaymentMethod
import java.math.BigDecimal

data class PaymentRequest(
    val reservationId: Long,
    val amount: BigDecimal,
    val paymentMethod: PaymentMethod
)