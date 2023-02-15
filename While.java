/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Leer una palabra desde el usuario
        System.out.print("Ingrese una palabra: ");
        String palabra = input.next();
        
        // Inicializar la variable para almacenar la palabra invertida
        String palabraInvertida = "";
        
        // Recorrer la palabra desde el final hacia el principio
        int i = palabra.length() - 1;
        while (i >= 0) {
            // Concatenar el caracter actual al final de la palabra invertida
            palabraInvertida += palabra.charAt(i);
            i--;
        }
        
        // Imprimir la palabra invertida
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
    
}
