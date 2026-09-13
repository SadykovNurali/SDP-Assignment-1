public class TicketDirector {

    public EventTicket createVipTicket(TicketBuilder builder) {

        return builder
                .setEventName(" Iglesais Concert")
                .setVenue("Astana Arena")
                .setSeat("E5")
                .setTicketType("VIP")
                .setParking(true)
                .setFoodVoucher(true)
                .build();
    }

    public EventTicket createStandardTicket(TicketBuilder builder) {

        return builder
                .setEventName("Iglesias Concert")
                .setVenue("Astana Arena")
                .setSeat("E7")
                .setTicketType("Standard")
                .setParking(false)
                .setFoodVoucher(false)
                .build();
    }
}