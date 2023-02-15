/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class While3 {
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
        int[] preciosProductos = new int[numProductos];
        
        int i = 0;
        while (i < numProductos) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombresProductos[i] = scanner.next();
            
            System.out.print("Ingrese la cantidad del producto " + nombresProductos[i] + ": ");
            cantidadesProductos[i] = scanner.nextInt();
            
            System.out.print("Ingrese el precio del producto " + nombresProductos[i] + ": ");
            preciosProductos[i] = scanner.nextInt();
            
            System.out.println("El precio del producto " + nombresProductos[i] + " es: " + preciosProductos[i] + " dólares.");
            
            i++;
        }
        
        System.out.println("Inventario:");
        i = 1;
        while (i <= numProductos) {
            int j = i - 1;
            String nombre = nombresProductos[j];
            int cantidad = cantidadesProductos[j];
            double precio = preciosProductos[j];
            
            System.out.println(i + ". " + nombre + " - Cantidad: " + cantidad + " - Precio: " + precio + " dólares.");
            
            i++;
        }
    }
    
}
