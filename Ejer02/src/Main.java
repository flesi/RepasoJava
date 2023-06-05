import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		LocalDate[] fechas = {		
				LocalDate.of(1022, 2, 22),
				LocalDate.of(2019, 2, 22),
				LocalDate.of(1031, 2, 22),
				LocalDate.of(1942, 2, 22)
		};
		
		
		System.out.println(fechaMasAntigua(fechas));
		
			
		

	}
	
	
	public static LocalDate fechaMasAntigua(LocalDate[] fechas) {
		LocalDate fechaMasAntigua= fechas[0];
		
		for (int i = 0; i < fechas.length; i++) {
			if (fechas[i].isBefore(fechaMasAntigua)) {
				fechaMasAntigua= fechas[i];
			}
		}
			
		return fechaMasAntigua;
	}

}
