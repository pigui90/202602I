package service;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;
        int resultado;

        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1 Semana 2

        /*
         * Este es un comentario de parrafo
         * Sigue siendo comentario
         */

        System.out.println("Indique el numero para saber su tabla de multiplicar");

        numero = scanner.nextInt();

        for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {
            resultado = numero * multiplicador;
            System.out.println(numero + " * " + multiplicador + " es: " + resultado);
        }
 




        
        scanner.close();
    }

}
