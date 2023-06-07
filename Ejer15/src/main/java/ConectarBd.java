import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBd {

	private static Connection con = null;

	public static Connection getConnection() throws SQLException {
		if (con == null) {
			con = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels", 
					"root", "");
		}
		return con;
	}
	
	public static void closeConnection() throws SQLException {
		con.close();
	}

}