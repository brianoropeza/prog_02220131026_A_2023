/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class For3 {
     public static void main(String[] args) {
        Random rand = new Random();
        int inventarioSize = rand.nextInt(23) + 1;

        String[] nombres = new String[inventarioSize];
        int[] cantidades = new int[inventarioSize];
        double[] precios = new double[inventarioSize];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < inventarioSize; i++) {
            System.out.println("Producto #" + (i+1));
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea pendiente
            System.out.print("Precio: ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume el salto de línea pendiente
            System.out.println();
        }

        System.out.println("Inventario");
        for (int i = 0; i < inventarioSize; i++) {
            System.out.println((i+1) + ". " + nombres[i] + " - " + cantidades[i] + " unidades - $" + precios[i] + " cada una");
        }
    }
}
