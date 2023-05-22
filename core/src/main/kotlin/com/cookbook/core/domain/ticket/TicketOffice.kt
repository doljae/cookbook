package com.cookbook.core.domain.ticket

class TicketOffice(
    private var amount: Long,
    private var tickets: List<Ticket> = ArrayList(),
) {
    fun getTicket() = tickets[0]
    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
