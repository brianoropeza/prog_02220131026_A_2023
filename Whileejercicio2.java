/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Whileejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener los últimos 3 dígitos del código estudiantil
        System.out.print("Ingrese los últimos 3 dígitos de su código estudiantil: ");
        int codigo = scanner.nextInt();
        double num = 0;
        double[] numeros = new double[codigo + 1];

        // Generar números desde 0 hasta el número ingresado
        int i = 0;
        while (i <= codigo) {
            numeros[i] = num;
            num += 1;
            i += 1;
        }

        // Calcular la media
        double suma = 0;
        i = 0;
        while (i <= codigo) {
            suma += numeros[i];
            i += 1;
        }
        double media = suma / (codigo + 1);

        // Calcular la mediana
        double mediana;
        if (codigo % 2 == 0) {
            mediana = (numeros[codigo / 2] + numeros[(codigo / 2) + 1]) / 2;
        } else {
            mediana = numeros[(codigo / 2) + 1];
        }

        // Calcular la moda
        int[] frecuencias = new int[codigo + 1];
        int maxFrecuencia = 0;
        double moda = 0;
        i = 0;
        while (i <= codigo) {
            int frecuencia = 0;
            for (int j = 0; j <= codigo; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia += 1;
                }
            }
            frecuencias[i] = frecuencia;
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = numeros[i];
            }
            i += 1;
        }

        // Imprimir los resultados
        System.out.println("Números generados:");
        i = 0;
        while (i <= codigo) {
            System.out.print(numeros[i] + " ");
            i += 1;
        }
        System.out.println();
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
    }
    
}
