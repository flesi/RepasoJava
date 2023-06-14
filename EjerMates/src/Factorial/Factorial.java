package Factorial;

public class Factorial {

	 public static int factorial(int n) {
	        int resultado = 1;
	        for (int i = 2; i <= n; i++) {
	            resultado *= i;
	        }
	        return resultado;
	    }

	    public static int calcularFactorialSuma(int numero) {
	        int sumaFactoriales = 0;
	        int numeroOriginal = numero;

	        while (numero != 0) {
	            int digito = numero % 10;
	            sumaFactoriales += factorial(digito);
	            numero /= 10;
	        }

	        return sumaFactoriales;
	    }

	    public static void main(String[] args) {
	        int numero = 145;

	        int resultado = calcularFactorialSuma(numero);

	        System.out.println(numero + " = " + resultado);
	    }

}
