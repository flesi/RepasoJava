import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionEmpleados {
	
		
	public void LeerDocumento() throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new FileReader("empleados.csv"));
				
        String strCurrentLine; 
        br.readLine();
        while ((strCurrentLine = br.readLine()) != null) {   
        	String Empleado = strCurrentLine.split(",")[0].toString();	
        	int nEmpleado = Integer.parseInt(Empleado);
            
        	System.out.print(strCurrentLine.toString());
        	
          if (comprobarEmpleado(nEmpleado)) {
				System.out.print(" - Es empleado");
			} else {
				System.out.print("- No es Empleado");
			}
         System.out.println("");   
        }
	}
	
	public boolean comprobarEmpleado(int nEmpleado) throws SQLException {
		Connection conex = ConectarBd.getConnection();
	    String sql = "SELECT * FROM `empleados` WHERE numeroEmpleado = ?";
	    PreparedStatement ps = conex.prepareStatement(sql, 
	    		ResultSet.TYPE_SCROLL_SENSITIVE, 
	            ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(1, nEmpleado);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    rs.last();
	    int nFilas = rs.getRow();
	    	    
	    if (nFilas>0) {
	    	return true;
		} else {
			return false;
		}
	    
	}

}
