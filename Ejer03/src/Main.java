import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			System.out.println(i + " - " + obtenerLetras(numero));
		}
		
		
	}
	
	public static String obtenerLetras(int numero) {
		StringBuilder sb = new StringBuilder();
		char letra = 'a';
		for (int i = 0; i < numero; i++) {
			sb.append(letra);
			letra++;
			
			if (letra > 'z') {
				letra = 'a';
			}
		}	
		
		return sb.toString();
	}

}
