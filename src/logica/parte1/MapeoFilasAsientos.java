package logica.parte1;
import java.util.Scanner;

public class MapeoFilasAsientos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] asientos = new char[10][10];
        int fila;
        int asiento;
        String opcion;
        String opcionMapa;
        for(int f =0; f < asientos.length;f++){
            for(int c =0; c < asientos.length;c++){
                asientos[f][c] = 'L';  //L= libre
            }
        }

        System.out.println("--------SISTEMA DE RESERVAS--------");
        while(true) {

            System.out.println("Desea ver el mapa de los asientos disponibles? (si)");
            opcionMapa = sc.next();
            if(opcionMapa.equalsIgnoreCase("si")){
                mapeoAsientos(asientos);
                System.out.println("");
            }

            System.out.println("Ingrese fila y asiento a reservar  ");

            while(true) {
                System.out.print("Fila (entre 1 y 10): ");
                fila = sc.nextInt() - 1;
                if (fila > 9) {
                    System.out.println("Valor excedido, ingrese un valor válido por favor. ");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.print("Asiento (entre 1 y 10): ");
                asiento = sc.nextInt() - 1;
                if (asiento > 9) {
                    System.out.println("Valor excedido, ingrese un valor válido por favor. ");
                    continue;
                }
                break;
            }

            if(asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("¡Asiento reservado exitosamente!");

            }else {
                System.out.println("Lo siento, el asiento ya fue reservado.");
            }

            System.out.println("¿Desea seguir reservando?");
            System.out.print("Ingrese 'No' para salir: ");
            opcion = sc.next();

            if(opcion.equalsIgnoreCase("no")){
                break;
            }
        }
    }

    static void mapeoAsientos(char[][]asientos){
        for(int f =0; f < asientos.length;f++){
            System.out.print((f+1)+" ");
            for(int c =0; c < asientos.length;c++){
                System.out.print("["+asientos[f][c]+"]");
            }
            System.out.println("");
        }
    }
}
