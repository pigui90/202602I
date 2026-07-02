package service;

import java.util.Scanner;

import model.Transporte;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Transporte transporte = new Transporte();


        
        System.out.println("El valor de la placa es " + transporte.getPlaca());

        System.out.println("Digite el valor de la placa/matricula");
        String matricula = scan.next();

        transporte.setPlaca(matricula);

        System.out.println("El valor de la placa es " + transporte.getPlaca());



        scan.close();
    }
}
