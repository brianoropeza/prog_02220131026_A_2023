/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Arrays;

/**
 *
 * @author brian
 */
public class Doejercicio2 {
     public static void main(String[] args) {
        int codigoEstudiantil = 026;
        int ultimos3Digitos = codigoEstudiantil % 1000;
        int n = ultimos3Digitos + 1;
        double[] numeros = new double[n];

        int i = 0;

        do {
            numeros[i] = (double) i;
            i++;
        } while (i < n);

        double mediana;
        double moda;
        double promedio;
        Arrays.sort(numeros);

        if (n % 2 == 0) {
            mediana = (numeros[n/2] + numeros[(n/2) - 1]) / 2;
        } else {
            mediana = numeros[n/2];
        }

        int maxFrecuencia = 0;
        double valorModa = numeros[0];

        for (i = 0; i < n; i++) {
            int frecuencia = 0;

            for (int j = i; j < n; j++) {
                if (numeros[j] == numeros[i]) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                valorModa = numeros[i];
            }
        }

        double sum = 0;

        for (double num : numeros) {
            sum += num;
        }

        promedio = sum / n;

        System.out.println("Rango de números: " + Arrays.toString(numeros));
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + valorModa);
        System.out.println("Promedio: " + promedio);
    }
}
