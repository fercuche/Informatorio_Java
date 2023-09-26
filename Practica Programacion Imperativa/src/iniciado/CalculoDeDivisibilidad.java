package iniciado;

import java.util.Scanner;

public class CalculoDeDivisibilidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        boolean divisible = numero1 % numero2 == 0;

        System.out.println("La suma es: " + suma);
        System.out.printf("¿%d es divisible por %d? %b",numero1,numero2,divisible);

        scanner.close();
    }
}

