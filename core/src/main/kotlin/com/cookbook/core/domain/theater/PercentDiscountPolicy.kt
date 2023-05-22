package com.cookbook.core.domain.theater

class PercentDiscountPolicy(private val percent: Double, conditions: List<DiscountCondition>) : DefaultDiscountPolicy(
    conditions,
) {
    override fun getDiscountAmount(screening: Screening): Money = screening.getMovieFee().times(percent)
}
