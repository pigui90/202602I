package service;

import java.util.Scanner;

import model.TipoTarifa;
import model.TipoTransporte;
import model.Transporte;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*****Hola, bienvenido al sistema de transportes****");

        Transporte transporte = new Transporte();
        TipoTarifa tipoTarifa = new TipoTarifa();
        TipoTransporte tipoTransporte = null;

        String desc;
        boolean active;
        int capacidad;
        int tarifa;
        int opcion = 0;
        do {
            System.out.println(
                    "Escoja una opcion\n1. Ingresar un Tipo Tarifa\n2. Ingresar un Tipo Transporte\n3. Ingresar un Transporte\n4. Salir");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresando un tipo Tarifa");
                    System.out.println("Digame una descripcion");
                    desc = scan.next();
                    System.out.println("Indique True para Activo False para Inactivo");
                    active = scan.nextBoolean();
                    tipoTarifa.setActivo(active);
                    tipoTarifa.setDescripcion(desc);
                    break;
                case 2:
                    System.out.println("Ingresando un tipo Transporte");
                    System.out.println("Digame una descripcion");
                    desc = scan.next();
                    System.out.println("Indique True para Activo False para Inactivo");
                    active = scan.nextBoolean();
                    tipoTransporte = new TipoTransporte(desc, active);
                    break;
                case 3:
                    System.out.println("Ingresando un transporte");

                    if(tipoTarifa.getDescripcion() != null && tipoTransporte !=null){
                        transporte.setTipoTarifa(tipoTarifa);
                        transporte.setTipoTransporte(tipoTransporte);
                        System.out.println("Cual es la placa?");
                        transporte.setPlaca(scan.next());
                        System.out.println("Cuanto es la tarifa?");
                        tarifa = scan.nextInt();
                        transporte.setTarifa(tarifa);
                        System.out.println("¿Cual es la capacidad?");
                        capacidad = scan.nextInt();
                        transporte.setCapacidad(capacidad);
                        System.out.println("Ganancia Total " + transporte.gananciaTotal());
                    }else{
                        System.out.println("Debe ingresar primero a las 2 opciones anteriores");
                    }

                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema");

                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta");
                    break;
            }

        } while (opcion != 4);

        System.out.println("Saliendo del sistema");

        scan.close();
    }
}
