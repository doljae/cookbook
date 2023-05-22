package com.cookbook.core.domain.theater

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}
