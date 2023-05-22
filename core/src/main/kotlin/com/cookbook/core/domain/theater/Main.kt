package com.cookbook.core.domain.theater

import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

fun main() {
    val avatar = Movie(
        title = "아바타",
        runningTime = Duration.ofMinutes(120),
        fee = Money.wons(10000),
        discountPolicy =
        AmountDiscountPolicy(
            discountAmount = Money.wons(800),
            listOf(
                SequenceCondition(sequence = 1),
                SequenceCondition(sequence = 10),
                PeriodCondition(
                    dayOfWeek = DayOfWeek.MONDAY,
                    startTime = LocalTime.of(10, 0),
                    endTime = LocalTime.of(11, 59),
                ),
            ),
        ),
    )

    val avatar2 = Movie(
        title = "아바타2",
        runningTime = Duration.ofMinutes(120),
        fee = Money.wons(10000),
        discountPolicy = NoneDiscountPolicy(listOf()),
    )
}
