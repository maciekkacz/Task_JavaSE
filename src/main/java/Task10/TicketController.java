package Task10;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        int numberOfPassengers = 4;
        Passenger[] passengers = new Passenger[numberOfPassengers];
        passengers[0] = new Passenger( "Maciej", "Kaczmarczyk" );
        passengers[1] = new Passenger( "Beata", "Leszczyńska" );
        passengers[2] = new Passenger( "Andrzej", "Wiosło" );
        passengers[3] = new Passenger( "Piotr", "Polo" );

        TicketMachine.buyTicket( passengers[0],20 );
        TicketMachine.buyTicket( passengers[1],45 );
        TicketMachine.buyTicket( passengers[2],75 );
        Ticket invalidTicket = new Ticket( LocalDateTime.now().minusMinutes( 30 ), 20 );
        passengers[3].setTicket(invalidTicket);

        Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("Na gapę jadą:");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }
    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
        }

        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if(ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }

        return withoutTicket;
    }


}
