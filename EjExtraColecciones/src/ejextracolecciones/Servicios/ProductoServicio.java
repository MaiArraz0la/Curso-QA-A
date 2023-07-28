
package ejextracolecciones.Servicios;

import ejextracolecciones.Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductoServicio {
    //Creamos el arraylist
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Producto> ListadeProductos = new ArrayList<>();
    
    
    int id = 1;
    
    public void menu (){
    
    int opcion=0;
    
    do {
            System.out.println("1. Agregar producto\n2. Vender producto\n3. Reponer producto\n4. Mostrar productos\n5. Borrar producto\n6. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    ventaProducto();
                    break;
                case 3:
                    reposicionProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    borrarProducto();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 6);
    }
    
       
    public void crearProducto()
    {
    Producto p1= new Producto();
    System.out.println("Digita el nombre");
    p1.setNombre(leer.next());
    System.out.println("Digita la categoría");
    p1.setCategoria(leer.next());
    System.out.println("Digita el precio");
    p1.setPrecio(leer.nextDouble());
    System.out.println("Ingresa la cantidad en inventario");
    p1.setCantidadInventario(leer.nextInt());
        
    ListadeProductos.add(p1);
    
    }
      
    public void ventaProducto()
    {
    
    System.out.println("Digita el nombre del producto que quieres vender");
    String nombreVenta = leer.next();
    System.out.println("Ingresa la cantidad que quieres vender");
    int cantVenta = leer.nextInt();
    
        for (Producto p1 : ListadeProductos) {
            if (nombreVenta.equalsIgnoreCase(p1.getNombre()) && cantVenta<p1.getCantidadInventario()){
                for (int i = 0; i < cantVenta; i++) {
                     p1.setCantidadInventario(p1.getCantidadInventario()-1);
                }
               break;
            } else {
              System.out.println("El producto no existe o quieres vender más de lo existente");  
            }
           
        }
    }
    
    public void reposicionProducto()
    {
    System.out.println("Digita el nombre del producto que quieres reponer");
    String nombreReposicion = leer.next();
    System.out.println("Ingresa la cantidad que quieres vender");
    int cantReposicion = leer.nextInt();
    
        for (Producto p1 : ListadeProductos) {
            if (nombreReposicion.equalsIgnoreCase(p1.getNombre())){
            p1.setCantidadInventario(p1.getCantidadInventario()+cantReposicion);
            break;
            } 
            
            else {
              System.out.println("El producto no existe");  
            }
           
        }
    }
    
    public void mostrarProductos()
    {
       
        for (Producto p1 : ListadeProductos) {
            System.out.println(p1);  
 
        }
        System.out.println("");
    }
    
    
    public void borrarProducto()
    {
    
    System.out.println("Digita el nombre del producto que quieres eliminar");
    String nombreBorrar = leer.next();
    
    for (Producto p1 : ListadeProductos) {
            if (nombreBorrar.equalsIgnoreCase(p1.getNombre())){
               ListadeProductos.remove(p1); 
            }
        }
    }
    
    
}

