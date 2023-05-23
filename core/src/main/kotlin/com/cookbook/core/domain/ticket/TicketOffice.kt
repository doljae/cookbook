package com.cookbook.core.domain.ticket

class TicketOffice(
    private var amount: Long,
    private var tickets: List<Ticket> = ArrayList(),
) {
    fun getTicket(): Ticket = tickets[0]
    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

//    fun sellTicketTo(audience: Audience) {
//        plusAmount(audience.buy(ticket = getTicket()))
//    }
}
