package com.cookbook.core.domain.theater

abstract class DefaultDiscountPolicy(
    private val conditions: List<DiscountCondition>,
) : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money {
        for (condition in conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    abstract fun getDiscountAmount(screening: Screening): Money
}
