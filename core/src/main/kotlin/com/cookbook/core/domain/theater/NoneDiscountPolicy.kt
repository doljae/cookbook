package com.cookbook.core.domain.theater

class NoneDiscountPolicy(conditions: List<DiscountCondition>) : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money = Money.ZERO
}
