package com.cookbook.core.domain.theater

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
