/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author brian
 */
public class ForEachejercicio2 {
    public static void main(String[] args) {
        int codigoEstudiantil = 026; 
        int ultimos3Digitos = codigoEstudiantil % 1000;
        int n = ultimos3Digitos + 1;
        ArrayList<Double> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add((double) i);
        }

        double mediana;
        double moda;
        double promedio;

        Collections.sort(numeros);

        if (n % 2 == 0) {
            mediana = (numeros.get(n/2) + numeros.get((n/2) - 1)) / 2;
        } else {
            mediana = numeros.get(n/2);
        }

        int maxFrecuencia = 0;
        double valorModa = numeros.get(0);

        for (double num : numeros) {
            int frecuencia = Collections.frequency(numeros, num);

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                valorModa = num;
            }
        }

        double sum = 0;

        for (double num : numeros) {
            sum += num;
        }

        promedio = sum / n;

        System.out.println("Rango de números: " + numeros);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + valorModa);
        System.out.println("Promedio: " + promedio);
    }
}
