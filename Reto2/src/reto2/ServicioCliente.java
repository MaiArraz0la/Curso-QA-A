
package reto2;

import java.util.ArrayList;
import java.util.List;


public class ServicioCliente {
    //atributos
   private static ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>(); 
   
   //CRUD
   
   //Create
   public void registrarCliente(int cedula, String nombre, int peso, int altura, int edad)
   {
       Cliente clienteNuevo = new Cliente();
       
       //Asignamos los valores de las propiedades al objeto Cliente
       clienteNuevo.SetId(cedula);
       clienteNuevo.SetNombre(nombre);
       clienteNuevo.SetEdad(edad);
       clienteNuevo.setAltura(altura);
       clienteNuevo.setPeso(peso);
       
       listaDeClientes.add(clienteNuevo);
   }
   
   // Read
   public ArrayList<Cliente> obtenerClientes()
   {
       return listaDeClientes;
   }
   
   // Update
   public void actualizarCliente(int cedula, String nombre, int peso, int altura, int edad)
   {
       for (int i = 0; i < listaDeClientes.size() - 1; i++)
       {
           Cliente clienteEnLaLista = listaDeClientes.get(i);
           
           int identificador = clienteEnLaLista.GetId();
           
           if (identificador == cedula)
           {
               clienteEnLaLista.SetEdad(edad);
               clienteEnLaLista.SetNombre(nombre);
               clienteEnLaLista.setPeso(peso);
               clienteEnLaLista.setAltura(altura);
               break;
           }
       }
   }
   
   //Delete
   public void eliminarCliente(int id)
   {
       for (int i = 0; i < listaDeClientes.size() - 1; i++)
       {
           Cliente clienteEnLaLista = listaDeClientes.get(i);
           
           int identificador = clienteEnLaLista.GetId();
           
           if (identificador == id)
           {
               listaDeClientes.remove(i);
               break;
           }
       }
   }
}
