/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author brian    
 */
public class Do {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa una palabra: ");
            String palabra = sc.nextLine();
            
            int longitud = palabra.length();
            int i = longitud - 1;
            
            System.out.print("El reverso de la palabra es: ");
            do {
                System.out.print(palabra.charAt(i));
                i--;
            } while (i >= 0);
        }
    }
    
}
