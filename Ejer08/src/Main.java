import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int [][] matriz = crearMatriz(valores);
        
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
        
	}
	
	
	public static int[][] crearMatriz(int[] valores){
		int filas = valores.length;
		int columnas = 5;
		
		int [][] matriz = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = valores[i] +j;
			}
		}
		
		return matriz;
	}

}
