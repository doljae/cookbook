package com.cookbook.core.domain.ticket

class TicketSeller(
    private val ticketOffice: TicketOffice,
) {
    fun getTicketOffice(): TicketOffice = ticketOffice
}
