package com.cookbook.core.domain.theater

import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    private val whenScreened: LocalDateTime,
) {
    fun getStartTime(): LocalDateTime = whenScreened

    fun isSequence(sequence: Int): Boolean = this.sequence == sequence

    fun getMovieFee(): Money = movie.getFee()

    fun reserve(customer: Customer, audienceCount: Int): Reservation = Reservation(
        customer = customer,
        screening = this,
        fee = calculateFee(audienceCount),
        audienceCount = audienceCount,
    )

    private fun calculateFee(audienceCount: Int): Money = movie.calculateMovieFee(this).times(audienceCount)
}
