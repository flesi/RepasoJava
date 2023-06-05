import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate f1 = LocalDate.of(2001, 10, 10);
		LocalDate f2 = LocalDate.of(2002, 12, 10);
		
		
    	System.out.println("Diferencia dias: " + getDiferencia(f1,f2,"dias"));
    	
    	System.out.println("Diferencia meses: " + getDiferencia(f1,f2,"meses"));
    	
    	System.out.println("Diferencia años: " + getDiferencia(f1,f2,"años"));
    	
    	//System.out.println(getDiferencia(f1,f2,"ddes"));

		

	}
	
	public static int getDiferencia(LocalDate f1, LocalDate f2, String opc) {
		int diferencia = 0;
		if (opc.equalsIgnoreCase("dias")) {
			diferencia = (int) ChronoUnit.DAYS.between(f1, f2);
		} else if (opc.equalsIgnoreCase("meses")) {
			diferencia = (int) ChronoUnit.MONTHS.between(f1, f2);
		} else if (opc.equalsIgnoreCase("años")) {
			diferencia = (int) ChronoUnit.YEARS.between(f1, f2);
		} else {
			System.out.print("Opcion no valida ");
		}
		return diferencia;
	}

}
