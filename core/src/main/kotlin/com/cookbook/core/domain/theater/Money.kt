package com.cookbook.core.domain.theater

import java.math.BigDecimal

class Money(
    private val amount: BigDecimal,
) {
    fun plus(amount: Money): Money = Money(this.amount.add(amount.amount))
    fun minus(amount: Money): Money = Money(this.amount.subtract(amount.amount))
    fun times(percent: Double): Money = Money(this.amount.multiply(BigDecimal(percent)))
    fun times(percent: Int): Money = Money(this.amount.multiply(BigDecimal(percent)))
    fun isLessThan(other: Money): Boolean = amount < other.amount
    fun isGreaterThanOrEqual(other: Money): Boolean = amount >= other.amount

    companion object {
        fun wons(amount: Long): Money = Money(BigDecimal(amount))
        fun wons(amount: Double): Money = Money(BigDecimal(amount))
        val ZERO: Money = wons(0)
    }
}
