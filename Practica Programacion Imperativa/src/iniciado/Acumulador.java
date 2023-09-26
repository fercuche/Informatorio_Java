package iniciado;

public class Acumulador {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 5;
        double resultado = 0;

        for (int i = 1; i <= 15; i++) {
            resultado += (numero1 * numero2) / i;
        }

        System.out.println("El resultado del acumulador es: " + resultado);
    }
}

