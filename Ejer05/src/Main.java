import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		 double[] valoresDouble = {1.5, 2.7, 3.9, 4.2, 5.1};
		 
		 int[] valoresInt = convertirDoubleAInt(valoresDouble);
		 
	       System.out.print("Valores double: ");
	        for (double valor : valoresDouble) {
	            System.out.print(valor + " ");
	        }

	        System.out.println();

	        System.out.print("Valores int: ");
	        for (int valor : valoresInt) {
	            System.out.print(valor + " ");
	        }
		 
	}

	public static int[] convertirDoubleAInt(double[] valoresDouble) {
		int [] valoresInt = new int[valoresDouble.length];
		
		for (int i = 0; i < valoresDouble.length; i++) {
			valoresInt[i] = (int) valoresDouble[i];
		}
		return valoresInt;
	}
}
