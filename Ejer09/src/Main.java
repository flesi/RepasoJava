import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        int[] arraySinRepetidos = eliminarRepetidos(array);

		System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array sin repetidos: " + Arrays.toString(arraySinRepetidos));

	}

	public static int[] eliminarRepetidos(int[] array) {
		HashSet<Integer> conjunto = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			conjunto.add(array[i]);
		}
		
		int[] arraySinRepetidos = new int[conjunto.size()];
        int indice = 0;
        for (int elemento : conjunto) {
        	arraySinRepetidos[indice++] = elemento;
        }

        return arraySinRepetidos;
		
	}
}
