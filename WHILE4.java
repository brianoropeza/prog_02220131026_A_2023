/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class WHILE4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Definir las palabras del crucigrama
        String palabra1 = "HOLA";
        String palabra2 = "CASA";
        String palabra3 = "AUTO"; 
        String palabra4 = "TIRO";
        
        // Definir la matriz para almacenar el crucigrama
        char[][] crucigrama = {
            {'_', '_', '_', '_'},
            {'_', '_', '_', '_'},
            {'_', '_', '_', '_'},
            {'_', '_', '_', '_'}
        };
        
        // Imprimir el crucigrama vacío
        System.out.println("Crucigrama:");
        System.out.println("lee las pistas y digita las palabras(todas las palabras son de 4 letras):lugar donde viven las personas, saludo mas comun, medio de transporte mas usado en el mundo, objeto expulsado por un arma de fuego ");
        for (int i = 0; i < crucigrama.length; i++) {
            for (int j = 0; j < crucigrama[i].length; j++) {
                System.out.print(crucigrama[i][j] + " ");
            }
            System.out.println();
        }
        
        // Preguntar al usuario por las palabras
        int contador = 0;
        while (contador < 4) {
            System.out.print("Ingrese una palabra: ");
            String palabra = input.next().toUpperCase();
            
            if (palabra.equals(palabra1)) {
                // Llenar las letras de la primera palabra en el crucigrama
                crucigrama[0][0] = 'H';
                crucigrama[1][0] = 'O';
                crucigrama[2][0] = 'L';
                crucigrama[3][0] = 'A';
                contador++;
            } else if (palabra.equals(palabra2)) {
                // Llenar las letras de la segunda palabra en el crucigrama
                crucigrama[0][1] = 'C';
                crucigrama[1][1] = 'A';
                crucigrama[2][1] = 'S';
                crucigrama[3][1] = 'A';
                contador++;
            } else if (palabra.equals(palabra3)) {
                // Llenar las letras de la tercera palabra en el crucigrama
                crucigrama[0][2] = 'A';
                crucigrama[1][2] = 'U';
                crucigrama[2][2] = 'T';
                crucigrama[3][2] = 'O';
                contador++;
            } else if (palabra.equals(palabra4)) {
                // Llenar las letras de la tercera palabra en el crucigrama
                crucigrama[0][3] = 'T';
                crucigrama[1][3] = 'I';
                crucigrama[2][3] = 'R';
                crucigrama[3][3] = 'O';
                contador++;
            } else {
                // Si la palabra no es válida, pedirle al usuario que lo intente de nuevo
                System.out.println("Palabra inválida, intente de nuevo");
            }
            
            // Imprimir el crucigrama actualizado
            System.out.println("Crucigrama:");
            for (int i = 0; i < crucigrama.length; i++) {
                for (int j = 0; j < crucigrama[i].length; j++) {
                    System.out.print(crucigrama[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        // Si el contador llega a 3, el usuario ha completado el crucigrama
        System.out.println("¡Felicidades, has completado el crucigrama!");
    }
}
