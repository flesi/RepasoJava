
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionEmpresas gestionEmpresas = new GestionEmpresas();
		
		//gestionEmpresas.CargarDatos();
		
		//gestionEmpresas.mostarDatos();
		
//		for (Empresas empresa : gestionEmpresas.getTop10()) {
//			System.out.println(empresa.toString());
//		};
		
		
		for (Empresas empresa : gestionEmpresas.empresasFromOrdenado("Bulgaria")) {
		System.out.println(empresa.toString());
	};
		
		//System.out.println(gestionEmpresas.EmpresaMasEmpleados());
	}

}
