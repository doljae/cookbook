package com.cookbook.core.domain.ticket

class Ticket(private val fee: Long) {
    fun getFee(): Long = fee
}
