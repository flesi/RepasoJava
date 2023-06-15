package lambda;

import java.util.Arrays;

public class main {
	
	
//	Retornar true/false si una cadena contiene un carácter específico:
	interface ContieneCaracter {
	    boolean contieneCaracter(String cadena, char caracter);
	}

	ContieneCaracter contieneCaracterLambda = (cadena, caracter) -> cadena.contains(String.valueOf(caracter));

	
//	Retornar la cadena de mayor longitud entre dos cadenas pasadas como parámetro:
	interface MayorLongitud {
	    String obtenerMayorLongitud(String cadena1, String cadena2);
	}

	MayorLongitud mayorLongitudLambda = (cadena1, cadena2) -> {
	    if (cadena1.length() >= cadena2.length()) {
	        return cadena1;
	    } else {
	        return cadena2;
	    }
	};

//	Retornar el mayor valor de un array pasado como parámetro:
	interface MayorValorArray {
	    int obtenerMayorValor(int[] numeros);
	}

	MayorValorArray mayorValorArrayLambda = (numeros) -> Arrays.stream(numeros).max().orElse(0);

//	Retornar la suma de los valores de un array pasado como parámetro:
	interface SumaValores {
	    int sumarValores(int[] numeros);
	}

	SumaValores sumaValoresLambda = (numeros) -> Arrays.stream(numeros).sum();

//	Retornar el primer valor en orden ascendente de dos enteros pasados como parámetro (el menor):
	interface MenorValor {
	    int obtenerMenorValor(int num1, int num2);
	}

	MenorValor menorValorLambda = (num1, num2) -> Math.min(num1, num2);
	
	
//	Retornar el primer valor en orden descendente de dos enteros pasados como parámetro (el mayor):
	interface MayorValor {
	    int obtenerMayorValor(int num1, int num2);
	}

	MayorValor mayorValorLambda = (num1, num2) -> Math.max(num1, num2);

	
	
}

