
package ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Do3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numProductos;
        
        do {
            System.out.print("Ingrese el número de productos (entre 1 y 23): ");
            numProductos = scanner.nextInt();
        } while (numProductos < 1 || numProductos > 23);
        
        String[] nombresProductos = new String[numProductos];
        int[] cantidadesProductos = new int[numProductos];
        int [] preciosProductos = new int[numProductos];
        
        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombresProductos[i] = scanner.next();
            
            System.out.print("Ingrese la cantidad del producto " + nombresProductos[i] + ": ");
            cantidadesProductos[i] = scanner.nextInt();
            
            System.out.print("Ingrese el precio del producto " + nombresProductos[i] + ": ");
            preciosProductos[i] = scanner.nextInt();
            
            System.out.println("El precio del producto " + nombresProductos[i] + " es: $" + preciosProductos[i] + " cada uno.");
        }
        
        System.out.println("Inventario:");
        for (int i = 0; i < numProductos; i++) {
            System.out.println((i + 1) + ". " + nombresProductos[i] + " - Cantidad: " + cantidadesProductos[i] + " - Precio: $" + preciosProductos[i] + "cada uno");
        }
    }
}
       
    
    
