
package reto2;

import java.util.ArrayList;


public class Reto2 {

    
    public static void main(String[] args)
    {
        ServicioCliente servicio = new ServicioCliente();
        
        servicio.registrarCliente(1128438341, "Maira", 10, 10, 10);
        servicio.registrarCliente(1063287527, "Francisco", 10, 10, 10);
        servicio.registrarCliente(1128438342, "Alejandra", 10, 10, 10);
        servicio.registrarCliente(1128438343, "Diomedez", 10, 10, 10);
        servicio.registrarCliente(1128438344, "Diaz", 10, 10, 10);
        
        servicio.eliminarCliente(1128438342);
        
        servicio.actualizarCliente(1128438341, "Maira Alejandra", 20, 10, 10);
        
        ArrayList<Cliente> clientesMostrar = servicio.obtenerClientes();
        
        //Imprimir
        clientesMostrar.forEach((t) -> {
            System.out.println(t.GetId() + " - " + t.GetNombre() + " - " + t.GetEdad());
        });
    }
    
}
