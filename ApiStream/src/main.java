import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {

		//OPEREADORES INTERMEDIOS
		
//		filter: 
//		Permite filtrar los elementos del Stream según una condición específica. 
//		Solo los elementos que cumplan con la condición pasarán al siguiente paso del Stream.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numerosPares = numeros.stream()
		                                    .filter(num -> num % 2 == 0)
		                                    .collect(Collectors.toList());
		// Resultado: [2, 4, 6, 8, 10]

		
		
//		map: 
//		Permite transformar cada elemento del Stream aplicando una función específica. 
//		El resultado es un Stream con los elementos transformados.
		List<String> nombresMap = Arrays.asList("Juan", "María", "Pedro");
		List<Integer> longitudes = nombresMap.stream()
		                                  .map(String::length)
		                                  .collect(Collectors.toList());
		// Resultado: [4, 5, 5]

		
		
//		sorted: 
//		Permite ordenar los elementos del Stream de acuerdo a un criterio específico. 
//		Puede recibir un comparador personalizado o utilizar el orden natural de los elementos.
		List<Integer> numerosSorted = Arrays.asList(5, 2, 8, 1, 6);

		List<Integer> numerosOrdenados = numerosSorted.stream()
		                                        .sorted()
		                                        .collect(Collectors.toList());
		// Resultado: [1, 2, 5, 6, 8]

//		distinct: 
//		Permite eliminar los elementos duplicados del Stream, dejando solo los elementos únicos.
		List<Integer> numerosDistinct = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

		List<Integer> numerosUnicos = numerosDistinct.stream()
		                                     .distinct()
		                                     .collect(Collectors.toList());
		// Resultado: [1, 2, 3, 4]

		
		
//		flatMap: 
//		Esta operación se utiliza para tratar elementos que contienen una estructura anidada (por ejemplo, una lista dentro de otra lista) y "aplanar" esa estructura, obteniendo un único Stream plano con los elementos internos. Se aplica una función a cada elemento del Stream y luego se combinan los resultados en un solo Stream.
		List<List<Integer>> listas = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(3, 4),
			    Arrays.asList(5, 6)
			);

			List<Integer> numerosFlatMap = listas.stream()
			                              .flatMap(Collection::stream)
			                              .collect(Collectors.toList());
			// Resultado: [1, 2, 3, 4, 5, 6]

			
			
//			limit: 
//			Permite limitar la cantidad de elementos que se toman del Stream, 
//			devolviendo un nuevo Stream con los primeros n elementos.
			List<Integer> numerosLimit = Arrays.asList(1, 2, 3, 4, 5);

			List<Integer> primerosTresNumeros = numerosLimit.stream()
			                                           .limit(3)
			                                           .collect(Collectors.toList());
			// Resultado: [1, 2, 3]

			
//			skip: 
//			Permite saltar los primeros n elementos del Stream y devolver un nuevo Stream sin esos elementos.
			List<Integer> numerosSkip = Arrays.asList(1, 2, 3, 4, 5);

			List<Integer> numerosSinPrimerosDos = numerosSkip.stream()
			                                             .skip(2)
			                                             .collect(Collectors.toList());
			// Resultado: [3, 4, 5]

		
		
		
		
		//OPERACIONES FINALES
		
		
//		forEach: 
//		Permite realizar una acción o ejecutar un bloque de código para cada elemento del Stream.
		List<String> nombresForEach = Arrays.asList("Juan", "María", "Pedro");

		nombresForEach.stream()
		       .forEach(System.out::println);
		// Imprime cada nombre en la consola

		
//		collect: 
//		Permite acumular los elementos del Stream en una colección o estructura de datos específica, 
//		como una lista, conjunto, mapa, etc.
		List<Integer> numerosCollect = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> numerosDobles = numerosCollect.stream()
		                                     .map(num -> num * 2)
		                                     .collect(Collectors.toList());
		// Resultado: [2, 4, 6, 8, 10]

		
//		reduce: 
//		Combina los elementos del Stream en un único resultado 
//		aplicando una operación específica, como suma, multiplicación, concatenación, etc.
		List<Integer> numerosReduce = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> sumaTotal = numerosReduce.stream()
		                                     .reduce(Integer::sum);
		// Resultado: 15

		
//		count: 
//		Devuelve la cantidad total de elementos en el Stream.
		List<String> nombres = Arrays.asList("Juan", "María", "Pedro");

		long cantidadNombres = nombres.stream()
		                             .count();
		// Resultado: 3
		
		
//		groupBy: 
//		Esta operación se utiliza para agrupar los elementos del Stream según un criterio específico
//		y generar un Mapa donde la clave representa el resultado de la agrupación y el valor es una lista de los elementos correspondientes.
		
//		Map<String, List<Producto>> productosPorCategoria = productos.stream()
//	            .collect(Collectors.groupingBy(Producto::getCategoria));
		
		List<String> nombresGropBy = Arrays.asList("Juan", "María", "Pedro", "Ana");

		Map<Character, List<String>> nombresPorInicial = nombresGropBy.stream()
		                                                       .collect(Collectors.groupingBy(nombre -> nombre.charAt(0)));

		
		
		
//		min y max: 
//		Estas operaciones se utilizan para encontrar el valor mínimo (min) o máximo (max) 
//		dentro de un Stream en función de un criterio de ordenación.
//		min:
		List<Integer> numerosMin = Arrays.asList(5, 2, 8, 1, 6);

		Optional<Integer> minimo = numerosMin.stream()
		                                  .min(Integer::compare);

		minimo.ifPresent(valor -> System.out.println("Mínimo: " + valor));
		
//		max:
		List<Integer> numerosMax = Arrays.asList(5, 2, 8, 1, 6);

		Optional<Integer> maximo = numerosMax.stream()
		                                  .max(Integer::compare);

		maximo.ifPresent(valor -> System.out.println("Máximo: " + valor));


		
//		anyMatch, allMatch y noneMatch: 
//		Estas operaciones se utilizan para verificar si algún elemento (anyMatch), 
//		todos los elementos (allMatch) o ninguno de los elementos (noneMatch) de un Stream cumplen con una determinada condición.
//		anyMatch:
		List<Integer> numerosAnyMatch = Arrays.asList(1, 2, 3, 4, 5);

		boolean hayNumerosPares = numerosAnyMatch.stream()
		                                .anyMatch(num -> num % 2 == 0);

		System.out.println("¿Hay números pares? " + hayNumerosPares);

//		allMatch:
		List<Integer> numerosAllMatch = Arrays.asList(2, 4, 6, 8, 10);

		boolean todosSonPares = numerosAllMatch.stream()
		                              .allMatch(num -> num % 2 == 0);

		System.out.println("¿Son todos números pares? " + todosSonPares);

//		noneMatch:
		List<Integer> numerosNoneMatch = Arrays.asList(1, 3, 5, 7, 9);

		boolean ningunoEsPar = numerosNoneMatch.stream()
		                             .noneMatch(num -> num % 2 == 0);

		System.out.println("¿Ninguno de los números es par? " + ningunoEsPar);

	}

}
