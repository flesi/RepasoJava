import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 4; i++) {
			try {
				System.out.println("Nota Media Examen " + i + " -> " + getMediaExamen(i) );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	public static Double getMediaExamen(int idExamen) throws SQLException {
		Double notaMedia=0.0;
		
		
		Connection conex = ConectarBd.getConnection();
	    String sql = "SELECT AVG(nota) notamedia FROM `notas` WHERE idexamen= ?";
	    PreparedStatement ps = conex.prepareStatement(sql, 
	    		ResultSet.TYPE_SCROLL_SENSITIVE, 
	            ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(1, idExamen);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    rs.last();
	    int nFilas = rs.getRow();
	    rs.beforeFirst();
		
	    
	    if (nFilas>0) {
			while (rs.next()) {
				notaMedia = rs.getDouble("notamedia");
			}
		}
	    
		return notaMedia;
	}
}
