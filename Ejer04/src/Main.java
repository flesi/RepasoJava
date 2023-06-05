import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {6, 7, 8, 9, 10};
		
		int suma = sumarArrays(array1, array2);
		System.out.println("La suma de los arrays es: " + suma);
		
	}

	public static int sumarArrays(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			throw new IllegalArgumentException("Los arrays deben tener la misma longitud");
		}
		
		int suma = 0;
		for (int i = 0; i < array1.length; i++) {
			suma += array1[i] + array2[i];
		}
		
		return suma;
	}
}
