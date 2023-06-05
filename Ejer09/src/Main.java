import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		int[] arreglo = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        int[] arregloSinRepetidos = eliminarRepetidos(arreglo);

		System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo sin repetidos: " + Arrays.toString(arregloSinRepetidos));

	}

	public static int[] eliminarRepetidos(int[] arreglo) {
		HashSet<Integer> conjunto = new HashSet<>();
		for (int i = 0; i < arreglo.length; i++) {
			conjunto.add(arreglo[i]);
		}
		int[] arregloSinRepetidos = new int[conjunto.size()];
        int indice = 0;
        for (int elemento : conjunto) {
            arregloSinRepetidos[indice++] = elemento;
        }

        return arregloSinRepetidos;
		
	}
}
