package iniciado;

public class Multiplicacion {
    public static void main(String[] args) {
        double numeroReal1 = 3.5;
        double numeroReal2 = 2.0;
        int numeroEntero1 = 4;
        int numeroEntero2 = 2;

        double resultado1 = numeroReal1 * numeroReal2;
        int resultado2 = numeroEntero1 * numeroEntero2;
        double suma = resultado1 + resultado2;

        System.out.println("El resultado de la primera multiplicación es: " + resultado1);
        System.out.println("El resultado de la segunda multiplicación es: " + resultado2);
        System.out.println("La suma de las dos multiplicaciones es: " + suma);
    }
}

