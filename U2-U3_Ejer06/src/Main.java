import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		GestionAspirantes gAspirantes = new GestionAspirantes();
		gAspirantes.cargarDatos("aspirantes.csv");
		
		List<String> generos = gAspirantes.obtenerGeneros();
		System.out.println("Generos sin repeticiones: " + generos);

		String generoBuscado ="Male";
		long cantidadAspirantes = gAspirantes.contarAspirantesPorGenero(generoBuscado);
		System.out.println("Cantidad de aspirantes de genero " + generoBuscado + " " + cantidadAspirantes);
		
		
		List<Aspirante> aspirantesOrdenados = gAspirantes.ObtenerAspirantesOrdenados();
		System.out.println("Apellido y Nombre de los aspirantes: ");
		aspirantesOrdenados.forEach(aspirante -> System.out.println(aspirante.getApellido() + " " + aspirante.getNombre()));
	
		int idBuscado = 5;
		Optional<Aspirante> aspiranteEncontrado = gAspirantes.buscarPorID(idBuscado);
		if (aspiranteEncontrado.isPresent()) {
			System.out.println("Aspirante encontrado por ID " + idBuscado + ":" + aspiranteEncontrado.get());
		}
	}

}
