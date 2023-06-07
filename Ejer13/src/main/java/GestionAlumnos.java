import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GestionAlumnos {

	public static void notasExamen(int idExamen) throws SQLException, IOException, DocumentException {
		Connection conex = ConectarBd.getConnection();
	    String sql = "SELECT * FROM notas N INNER JOIN alumnos a ON n.idalumno = a.id INNER JOIN examenes e ON n.idexamen = e.id WHERE idexamen = ? ORDER BY a.nombre ASC";
	    PreparedStatement ps = conex.prepareStatement(sql, 
	    		ResultSet.TYPE_SCROLL_SENSITIVE, 
	            ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(1, idExamen);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    rs.last();
	    int nFilas = rs.getRow();
	    rs.beforeFirst();
	    
	    
	    if (nFilas > 0) {
	    	
	    	 //Creamos un documento pdf
            Document documento = new Document();
            //creamos un archivo binario
            OutputStream ficheroPdf = Files.newOutputStream(Paths.get("NotasExamenID_" + idExamen + ".pdf"));
            
            //Asociar documento con FileOutputStream e indicar espacio entre líneas
            PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
            documento.open();
            
            //fuentes
            Font fontArialNormal = new Font(FontFactory.getFont("arial", 8, Font.NORMAL, BaseColor.BLACK));  
            Font fontArialNegrita = new Font(FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK));  
	    						   	        	
		            
					// CABECERA DEL DOCUMENTO PDF
		            //añadir tabla cabecera
		            PdfPTable tableCab = new PdfPTable(2); //2 columnas
		            
		            rs.next();
		            //nueva frase y añadimos a tabla
		            Phrase texto = new Phrase("ID Examen: " + rs.getInt("idexamen"), fontArialNegrita);            
		            tableCab.addCell(texto);
		            texto = new Phrase("Descripcion: " + rs.getString("descripcion"), fontArialNegrita);
		            tableCab.addCell(texto);
		        	
		            //Añadimos tableCab al documento
		            documento.add(tableCab);

			
			//Añadimos dos lineas en blanco
            documento.add(new Phrase(" "));
            documento.add(new Phrase(" "));
			
			rs.beforeFirst();
			while (rs.next()) {

	            PdfPTable tableDetalle = new PdfPTable(3);
	            
	            texto = new Phrase("Apellido: " + rs.getString("apellidos"), fontArialNegrita);            
	            tableDetalle.addCell(texto);
	            texto = new Phrase("Nombre: " + rs.getString("nombre"), fontArialNegrita);            
	            tableDetalle.addCell(texto);
	            texto = new Phrase("Nota: " + rs.getDouble("nota"), fontArialNegrita);            
	            tableDetalle.addCell(texto);
	            
	            documento.add(tableDetalle);

			}
			
			documento.close();
		}
	    
	   
	}
	
	
	
	
}
