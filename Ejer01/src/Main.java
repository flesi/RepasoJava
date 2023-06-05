import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate fecha1 = LocalDate.of(2001, 10, 10);
		LocalDate fecha2 = LocalDate.of(2002, 12, 10);
		
		
        long diferenciaDias = obtenerDiferenciaEnDias(fecha1, fecha2);
        long diferenciaMeses = obtenerDiferenciaEnMeses(fecha1, fecha2);
        long diferenciaAnios = obtenerDiferenciaEnAnios(fecha1, fecha2);

        System.out.println("Diferencia en días: " + diferenciaDias);
        System.out.println("Diferencia en meses: " + diferenciaMeses);
        System.out.println("Diferencia en años: " + diferenciaAnios);
		

	}
	
	 public static long obtenerDiferenciaEnDias(LocalDate fecha1, LocalDate fecha2) {
	        return ChronoUnit.DAYS.between(fecha1, fecha2);
	    }

	    public static long obtenerDiferenciaEnMeses(LocalDate fecha1, LocalDate fecha2) {
	        return ChronoUnit.MONTHS.between(fecha1, fecha2);
	    }

	    public static long obtenerDiferenciaEnAnios(LocalDate fecha1, LocalDate fecha2) {
	        return ChronoUnit.YEARS.between(fecha1, fecha2);
	    }

}
