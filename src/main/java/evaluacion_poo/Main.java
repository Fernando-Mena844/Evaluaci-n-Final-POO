package evaluacion_poo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        filaBanco fila = new filaBanco();
        int opcion=0;
        System.out.println("Bienvenido al sistema de la fila del banco.");
        while (opcion!=4){
            System.out.println("\nOpciones:");
            System.out.println("1) Agregar un cliente normal al final de la fila.");
            System.out.println("2) Agregar un cliente preferencial (embarazada/tercera edad) al principio de la fila.");
            System.out.println("3) Atender al siguiente cliente.");
            System.out.println("4) Salir del sistema.");
            System.out.print("Escriba el número correspondiente a la acción a realizar: ");
            opcion=Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre del cliente normal: ");
                    String cliente = sc.nextLine();
                    fila.agregarClienteNormal(cliente);
                    break;
                case 2:
                    System.out.print("\nIngrese el nombre del cliente preferencial: ");
                    String clienteVIP = sc.nextLine();
                    fila.agregarClienteVIP(clienteVIP);
                    break;
                case 3:
                    fila.atenderSiguienteCliente();
                    break;
                case 4:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}