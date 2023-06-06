import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class GestionProductos {

	//private ArrayList<Producto> productos = cargarProductos();
		
	public ArrayList<Producto> cargarProductos() throws SQLException{
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		Connection conex = ConectarBd.getConnection();
        String sql = "Select * from productos;";
        PreparedStatement ps = conex.prepareStatement(sql, 
        		ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = ps.executeQuery();
        
        rs.last();
        int nFilas = rs.getRow();
        rs.beforeFirst();
		
        while (rs.next()) {
			String codigoProducto = rs.getString("codigoProducto");
			String nombreProducto = rs.getString("nombreProducto"); 
			String categoriaProducto= rs.getString("categoriaProducto");
			String escala = rs.getString("escala");
			String vendedor = rs.getString("vendedor");
			String descripcion = rs.getString("descripcion");
			int unidadesStock = rs.getInt("unidadesStock");
			double precioCompra = rs.getDouble("precioCompra");
			double precioVenta = rs.getDouble("precioVenta");
			
			Producto producto = new Producto(codigoProducto, nombreProducto, categoriaProducto, escala, vendedor, descripcion, unidadesStock, precioCompra, precioVenta);
			productos.add(producto);
		}
     return productos;   
	}	
	
	
//	buscar producto por código.
//	public Optional<Producto> buscarPorCodigo(String codigo) throws SQLException {
//		ArrayList<Producto> productos = cargarProductos();
//		return productos.stream()
//				.filter(producto -> producto.getCodigoProducto().equals(codigo))
//				.findFirst()
//				.orElse(null);
//	}
//	retornar los productos con precio de compra entre dos valores. Ordenar por precio de compra ascendentemente.
//	retornar los productos de una escala concreta
//	retornar las categorías existentes. Una sola vez cada una.
//	mostrar los productos (código, nombre, vendedor y precio de compra) ordenando los datos por el campo precio de compra ASC.

	
	
}
