package numeroFuerte;

public class NumeroFuerte {

	 public static int factorial(int n) {
	        int resultado = 1;
	        for (int i = 2; i <= n; i++) {
	            resultado *= i;
	        }
	        return resultado;
	    }

	    public static boolean esFuerte(int numero) {
	        int numeroOriginal = numero;
	        int sumaFactoriales = 0;

	        while (numero != 0) {
	            int digito = numero % 10;
	            sumaFactoriales += factorial(digito);
	            numero /= 10;
	        }

	        return (sumaFactoriales == numeroOriginal);
	    }

	    public static void main(String[] args) {
	        int numero = 145;

	        if (esFuerte(numero)) {
	            System.out.println(numero + " es un número fuerte.");
	        } else {
	            System.out.println(numero + " no es un número fuerte.");
	        }
	    }

}
