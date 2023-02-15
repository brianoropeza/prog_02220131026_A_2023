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
public class For {
    public static void main(String[] args) {
       String palabra = "";
 
      if (args.length == 1) {
      palabra = args[0];
      }
      if (palabra.equals("")) {
          Scanner lecturaTeclado = new Scanner(System.in);
          System.out.print("Introduzca una palabra y pulse intro: ");
          palabra = lecturaTeclado.nextLine();
      }
      if (!palabra.isEmpty()) {
          System.out.print("La palabra " + palabra + " invertida es: " + InvertirPalabra(palabra));
      } else {
          System.out.println("No has dicho nada pai.");
      }
    }
 
    public static String InvertirPalabra(String palabra) {
        String palabraInvertida = "";
        for (int x = palabra.length() - 1; x >= 0; x--)
            palabraInvertida = palabraInvertida + palabra.charAt(x);
        return palabraInvertida;
    }
  
}
