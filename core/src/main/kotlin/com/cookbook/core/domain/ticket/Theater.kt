package com.cookbook.core.domain.ticket

class Theater(
    private val ticketSeller: TicketSeller,
) {
    fun enter(audience: Audience) {
        if (audience.getBag().hasInvitation()) {
            val ticket = ticketSeller.getTicketOffice().getTicket()
            audience.getBag().setTicket(ticket)
        } else {
            val ticket = ticketSeller.getTicketOffice().getTicket()
            audience.getBag().minusAmount(ticket.getFee())
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee())
            audience.getBag().setTicket(ticket)
        }
    }
}
