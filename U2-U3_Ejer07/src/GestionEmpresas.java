import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpresas {
	
	private List<Empresas> empresas;
	
	public void CargarDatos() {
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
					String country = datos[3];
					String website = datos[4];
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
	
	
	public void mostarDatos() {
		CargarDatos();
		for (Empresas empresa : empresas) {
			System.out.println(empresa.toString());
		}
	}

}
