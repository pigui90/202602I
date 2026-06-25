import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero");

        numero = scanner.nextInt();

        System.out.println("El numero que usted ingreso es " + numero);

        if (numero > 8255) {
            System.out.println("El numero es mayor a 8255");
            numero = 0;
        } else {
            System.out.println("El numero no es mayor, puede ser igual o menor 8255");
            numero = numero * 2;
            System.out.println(numero);
        }

        switch (numero) {
            case 0:
                System.out.println("El valor de numero es 0");
                numero = 5;
                break;
            case 2:
                System.out.println("El valor de numero es 2");
                break;
            default:
                System.out.println("El de numero no esta contemplado " + numero);
                if (numero % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
                break;
        }

        boolean seguir = true;
        while (seguir == true) {
            System.out.println("Desea continuar? True para Si o False para no");
            seguir = scanner.nextBoolean();
        }

        double aumento = 0;
        double salario = 0;
        do {
            System.out.println("Ingrese un pago nuevo a su salario");
            aumento = scanner.nextDouble();
            salario = salario + aumento;
        } while (salario <= 100000);

        System.out.println("Su salario final es de " + salario);

        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de i es " + i);
        }

        String nombre;

        System.out.println("Ingrese el nombre del profesor");
        nombre = scanner.next();

        if (nombre.equals("Sergio")) {
            System.out.println("Acerto el nombre, muy bien");
        }

        if (!nombre.equals("Sergio")) {
            System.out.println("Me parece que se equivoco de clase");
            System.out.println("Y esto es todo por hoy si se equivoco de clase");
        }

    }
}
