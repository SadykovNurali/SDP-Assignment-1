public class Main {

    public static void main(String[] args) {

        TicketDirector director = new TicketDirector();

        TicketBuilder vipBuilder = new ConcertTicketBuilder();

        EventTicket vipTicket =
                director.createVipTicket(vipBuilder);

        System.out.println("VIP TICKET:");
        System.out.println(vipTicket);

        System.out.println();

        TicketBuilder standardBuilder = new ConcertTicketBuilder();

        EventTicket standardTicket =
                director.createStandardTicket(standardBuilder);

        System.out.println("STANDARD TICKET:");
        System.out.println(standardTicket);

        System.out.println();


        EventTicket customTicket = new ConcertTicketBuilder()
                .setEventName("Football Match")
                .setVenue("Astana Arena")
                .setSeat("W15")
                .setTicketType("Premium")
                .setParking(true)
                .setFoodVoucher(false)
                .build();

        System.out.println("CUSTOM TICKET:");
        System.out.println(customTicket);

    }
}