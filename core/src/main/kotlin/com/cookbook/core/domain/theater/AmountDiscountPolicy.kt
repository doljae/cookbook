package com.cookbook.core.domain.theater

class AmountDiscountPolicy(private val discountAmount: Money, conditions: List<DiscountCondition>) :
    DefaultDiscountPolicy(conditions) {
    override fun getDiscountAmount(screening: Screening): Money = discountAmount
}
