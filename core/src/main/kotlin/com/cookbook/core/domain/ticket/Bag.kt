package com.cookbook.core.domain.ticket

class Bag(
    private var amount: Long,
    private var invitation: Invitation? = null,
    private var ticket: Ticket? = null,
) {
    fun hasInvitation(): Boolean = invitation != null
    fun hasTicket(): Boolean = ticket != null
    fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun hold(ticket: Ticket): Long {
        setTicket(ticket)
        return if (hasInvitation()) {
            0L
        } else {
            minusAmount(ticket.getFee())
            ticket.getFee()
        }
    }
}
