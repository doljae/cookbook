package com.cookbook.core.domain.ticket

class Audience(
    private val bag: Bag,
) {
    fun getBag(): Bag = bag
    fun setTicket(): Bag = bag
    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}
