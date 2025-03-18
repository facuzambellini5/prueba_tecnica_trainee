package logica.parte2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double recaudado = 0;
        int numeroFila;

        List<Ticket> ticketList = new ArrayList<>();

        //FORMAS DE AGREGAR AL ARRAYLIST
        ticketList.add(new Ticket(1,2,2,new Date(),new Date(),500));
        Ticket ticket1 = new Ticket(2,2,4,new Date(),new Date(),500);

        //Aca uso encapsulamiento y setters para asignar valores
        Ticket ticket2 = new Ticket();
        ticket2.setNumero(3);
        ticket2.setFila(4);
        ticket2.setAsiento(5);
        ticket2.setFechaCompra(new Date());
        ticket2.setFechaValidez(new Date());

        //Agrego los tickets a mi lista:

        ticketList.add(ticket1);
        ticketList.add(ticket2);


        //Sumo todos los precios de los tickets
        for(Ticket ticket : ticketList){
            recaudado += ticket.getPrecio();
        }

        System.out.println("El total recaudado es de: "+recaudado);

        System.out.println("Ingrese un numero de fila: ");
        numeroFila = sc.nextInt();

        boolean filaEncontrada = false;

        for (Ticket ticket : ticketList){
            if (ticket.getFila() == numeroFila){
                System.out.println(ticket.toString());
                filaEncontrada = true;
            }
        }
        if(!filaEncontrada){
            System.out.println("No se ha encontrado la fila seleccionada.");
        }


        Cliente cliente1 = new Cliente();
        cliente1.setId(4);
        cliente1.setDni(45789651);
        cliente1.setNombre("Rodolfo");
        cliente1.setApellido("Alvarez");

        cliente1.getTicketList().add(ticket1);

        Ticket ticket4 = new Ticket(10,5,3,new Date(2024-10-12), new Date(2024-11-12), 2500);
        cliente1.getTicketList().add(ticket4);

    }
}
