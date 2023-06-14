package Fibonacci;

public class Fibonacci {
	
    public static void generarFibonacci(int n) {
        int numero1 = 0;
        int numero2 = 1;

        System.out.print(numero1 + " " + numero2);

        for (int i = 2; i < n; i++) {
            int siguienteNumero = numero1 + numero2;
            System.out.print(" " + siguienteNumero);
            numero1 = numero2;
            numero2 = siguienteNumero;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Número de términos de la sucesión de Fibonacci a generar

        System.out.println("Sucesión de Fibonacci:");
        generarFibonacci(n);
    }
    
}
