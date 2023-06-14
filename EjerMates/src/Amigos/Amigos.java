package Amigos;

public class Amigos {

	 public static boolean sonAmigos(int numero1, int numero2) {
	        if (numero1 <= 0 || numero2 <= 0) {
	            return false;
	        }

	        int sumaDivisores1 = calcularSumaDivisores(numero1);
	        int sumaDivisores2 = calcularSumaDivisores(numero2);

	        return (sumaDivisores1 == numero2 && sumaDivisores2 == numero1);
	    }

	    private static int calcularSumaDivisores(int numero) {
	        int suma = 0;
	        for (int i = 1; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                suma += i;
	            }
	        }
	        return suma;
	    }

	    public static void main(String[] args) {
	        int numero1 = 220;
	        int numero2 = 284;

	        if (sonAmigos(numero1, numero2)) {
	            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
	        } else {
	            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
	        }
	    }
}
