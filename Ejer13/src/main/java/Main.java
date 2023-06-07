import java.io.IOException;
import java.sql.SQLException;

import com.itextpdf.text.DocumentException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestionAlumnos gAlumnos = new GestionAlumnos();
		
		try {
			try {
				
				gAlumnos.notasExamen(1);
				gAlumnos.notasExamen(2);
				gAlumnos.notasExamen(3);
				gAlumnos.notasExamen(4);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
