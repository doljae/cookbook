package com.cookbook.core.domain.theater

import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    private var discountPolicy: DiscountPolicy,
) {
    fun getFee(): Money = fee

    fun calculateMovieFee(screening: Screening): Money = fee.minus(discountPolicy.calculateDiscountAmount(screening))

    fun changeDiscountPolicy(discountPolicy: DiscountPolicy) {
        this.discountPolicy = discountPolicy
    }
}
