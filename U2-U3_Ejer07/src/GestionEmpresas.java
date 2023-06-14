import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestionEmpresas {
	
	private List<Empresas> empresas;
	
	public GestionEmpresas() {
		empresas = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("organizations-1000.csv"));
			
			String linea;
			Boolean primeraLinea = true;
			while ((linea=br.readLine()) != null) {
				if (primeraLinea) {
					primeraLinea= false;
				} else {
					String[] datos = linea.split(",");
					int index = Integer.parseInt(datos[0]);
					String id = datos[1];
					String name = datos[2];
					String country = datos[4];
					String website = datos[3];
					String description = datos[5];
					int founded = Integer.parseInt(datos[6]);
					String industry = datos[7];
					int numberOfEmployee = Integer.parseInt(datos[8]);
					
					Empresas empresa = new Empresas(index, id, name, country, website, description, founded, industry, numberOfEmployee);
					empresas.add(empresa);
				}
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	Extraer las 10 empresas con mayor número de empleados (todos los datos).
	
	public List<Empresas> getTop10(){
		return empresas.stream()
		.sorted(Comparator.comparingInt(Empresas::getNumberOfEmployee))
		.limit(10)
		.collect(Collectors.toList());
	}
	
	
	
//	Extraer la empresa (solo nombre) con mayor número de empleados.
	public Optional<String> EmpresaMasEmpleados(){
		return empresas.stream()
		.map(Empresas::getName)
		.findFirst();
		
	}
	
	
//	Extraer las empresas (todos los datos) de varios países pasados como parámetros.
	public List<Empresas> EmpresasFrom(String pais1, String pais2) {
		return empresas.stream()
		.filter(e -> e.getCountry().equalsIgnoreCase(pais1) && e.getCountry().equalsIgnoreCase(pais2))
		.toList();
	}
	
	
//	Mostrar las empresas de un país concreto ordenando los datos por número de trabajadores de forma ascendente.
	
	public List<Empresas> empresasFromOrdenado(String paisBuscado){
		return empresas.stream()
		.filter(e -> e.getCountry().equalsIgnoreCase(paisBuscado))
		.sorted(Comparator.comparingInt(Empresas::getNumberOfEmployee))
		.collect(Collectors.toList());
	}

		
	
	public void mostarDatos() {

		for (Empresas empresa : empresas) {
			System.out.println(empresa.toString());
		}
	}

}
