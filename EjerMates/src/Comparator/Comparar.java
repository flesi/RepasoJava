package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparar {
	 public static void main(String[] args) {
	        ArrayList<String> lista = new ArrayList<>();
	        lista.add("Zebra");
	        lista.add("Lion");
	        lista.add("Tiger");
	        lista.add("Elephant");
	        lista.add("Giraffe");

	        // Utilizar un Comparator para ordenar en orden alfabético
	        Comparator<String> comparador = new Comparator<String>() {
	            public int compare(String str1, String str2) {
	                return str1.compareTo(str2);
	            }
	        };

	        // Ordenar el ArrayList utilizando el Comparator
	        Collections.sort(lista, comparador);

	        // Imprimir el ArrayList ordenado
	        for (String elemento : lista) {
	            System.out.println(elemento);
	        }
	    }
}
