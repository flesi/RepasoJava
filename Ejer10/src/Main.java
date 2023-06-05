
public class Main {

	public static void main(String[] args) {
		 String cadena = "Hola 123 Mundo!";

		 clasificarCaracteres(cadena);
	}
	
	public static void clasificarCaracteres(String cadena) {
		for (char caracter : cadena.toCharArray()) {
			if (Character.isLetter(caracter)) {
				if (Character.isUpperCase(caracter)) {
					System.out.println(caracter + " - Es una letra mayuscula");
				} else {
					System.out.println(caracter + " - Es una letra minuscula");
				}
			} else if (Character.isDigit(caracter)) {
				System.out.println(caracter + " - Es un digito");
			} else if (Character.isWhitespace(caracter)) {
				System.out.println(caracter + " - Es un espacio en blanco");
			}else {
				System.out.println(caracter + " - Es otro caracter");
			}
		}
	}

}
