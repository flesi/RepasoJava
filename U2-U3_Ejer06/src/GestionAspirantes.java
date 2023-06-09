import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class GestionAspirantes {
    private List<Aspirante> aspirantes;
    
    public void cargarDatos(String archivo) {
        aspirantes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean primeraLinea = true; // Ignorar la primera línea que contiene los nombres de las columnas
            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String apellido = datos[2];
                String email = datos[3];
                String genero = datos[4];
                String departamento = datos[5];
                String puesto = datos[6];
                Aspirante aspirante = new Aspirante(id, nombre, apellido, email, genero, departamento, puesto);
                aspirantes.add(aspirante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<String> obtenerGeneros() {
        return aspirantes.stream()
                .map(Aspirante::getGenero)
                .distinct()
                .collect(Collectors.toList());
    }
    
    public long contarAspirantesPorGenero(String genero) {
    	return aspirantes.stream()
    			.filter(a -> a.getGenero().equals(genero))
    			.count();
    }
    
    public List<Aspirante> ObtenerAspirantesGeneroDepartamento(String genero, String departamento){
    	return aspirantes.stream()
    			.filter(a -> a.getGenero().equals(genero) && a.getDepartamento().equals(departamento))
    			.collect(Collectors.toList());
    	
    }
    
    public List<Aspirante> ObtenerAspirantesOrdenados(){
    	return aspirantes.stream()
    			.sorted(Comparator.comparing(Aspirante::getApellido).thenComparing(Aspirante::getNombre))
    			.collect(Collectors.toList());
    }
    
    public Optional<Aspirante> buscarPorID(int id){
    	return aspirantes.stream()
    			.filter(a -> a.getId() == id)
    			.findFirst();
    }

}
