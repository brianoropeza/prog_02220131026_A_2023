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
public class ForEach {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa una palabra: ");
            String palabra = sc.nextLine();
            
            System.out.print("El reverso de la palabra es: ");
            for (char c : new StringBuilder(palabra).reverse().toString().toCharArray()) {
                System.out.print(c);
            }
        }
    }
}
    

