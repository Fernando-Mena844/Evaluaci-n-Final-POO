package evaluacion_poo;

import java.util.LinkedList;

public class filaBanco {

    LinkedList<String> fila;

    public filaBanco() {
        this.fila = new LinkedList<>();
    }

    public void agregarClienteNormal(String nombre){
        fila.addLast(nombre);
    }

    public void agregarClienteVIP(String nombre){
        fila.addFirst(nombre);
    }

    public void atenderSiguienteCliente(){
        if(fila.size()<=0){ //Cuando no hay clientes, muestra explícitamente que no hay clientes
            System.out.println("\nNo hay próximos clientes por atender.");
        }
        else if(fila.size()==1){ //Cuando hay solo 1 cliente, solo muestra el nombre de ese cliente, y también dice que es el último en la fila.
            System.out.println("\nEl cliente a atender es: "+fila.getFirst());
            System.out.println("\n No hay próximos clientes por atender.");
            fila.pollFirst();
        } else if (fila.size()>=2) { //Cuando hay más de 2 clientes, muestra el nombre del cliente a atender, y quien sigue después de ese.
            System.out.println("\nEl cliente a atender es: "+fila.getFirst());
            fila.pollFirst();
            System.out.println("\nDespués, el siguiente en la lista es "+fila.peekFirst());
        }
    }
}