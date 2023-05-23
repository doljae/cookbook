package com.cookbook.core.domain.ticket

class TicketSeller(
    private val ticketOffice: TicketOffice,
) {

    fun sellTo(audience: Audience) {
//        ticketOffice.sellTicketTo(audience)
        ticketOffice.plusAmount(audience.buy(ticket = ticketOffice.getTicket()))
    }
}
