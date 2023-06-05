
public class Main {

	public static void main(String[] args) {
		int[] valores = {10, 25, 15, 5, 30, 18};

        pintarDiagramaBarras(valores);

	}

	public static void pintarDiagramaBarras(int[] valores) {
		for (int valor : valores) {
			if (valor <= 20) {
				System.out.print(valor + ": ");
				
				for (int i = 0; i < valor; i++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
	}
}
