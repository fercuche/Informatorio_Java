package iniciado;

import java.util.Scanner;

public class SumaDosNumerosConParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma de los números
        int suma = numero1 + numero2;

        // Determinar la paridad del resultado
        String paridad = (suma % 2 == 0) ? "par" : "impar";

        // Mostrar el resultado junto con la paridad
        System.out.println("El resultado es " + suma + " y es " + paridad);

        // Cerrar el scanner
        scanner.close();
    }
}
