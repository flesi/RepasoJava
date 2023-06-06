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
	    String sql = "SELECT * FROM examenes WHERE id = ?";
	    PreparedStatement ps = conex.prepareStatement(sql, 
	    		ResultSet.TYPE_SCROLL_SENSITIVE, 
	            ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(1, idExamen);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    rs.last();
	    int nFilas = rs.getRow();
	    rs.beforeFirst();
	    
	    if (nFilas > 0) {
			while (rs.next()) {
				System.out.print("ID Examen: " + rs.getInt("id"));
				System.out.println(" Descripcion: " + rs.getString("descripcion"));
								
	        	 //Creamos un documento pdf
	            Document documento = new Document();
	            //creamos un archivo binario
	            OutputStream ficheroPdf = Files.newOutputStream(Paths.get("documento.pdf"));
	            
	            //Asociar documento con FileOutputStream e indicar espacio entre líneas
	            PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
	            documento.open();
	            
	            //fuentes
	            Font fontArialNormal = new Font(FontFactory.getFont("arial", 8, Font.NORMAL, BaseColor.BLACK));  
	            Font fontArialNegrita = new Font(FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK));  
	        	
	            // CABECERA DEL DOCUMENTO PDF
	            
	            //añadir tabla cabecera
	            PdfPTable tableCab = new PdfPTable(2); //2 columnas
	            
	            //nueva frase y añadimos a tabla
	            Phrase texto = new Phrase("ID Examen: " + rs.getInt("id"), fontArialNegrita);            
	            tableCab.addCell(texto);
	            texto = new Phrase("Descripcion: " + rs.getString("descripcion"), fontArialNegrita);
	            tableCab.addCell(texto);
	        	
	            //Añadimos tableCab al documento
	            documento.add(tableCab);
	            
	            //Añadimos dos lineas en blanco
	            documento.add(new Phrase(" "));
	            documento.add(new Phrase(" "));
	            
	            PdfPTable tableDetalle = new PdfPTable(3);
	            
	            
	            
	            documento.close();
	            
			}
		}
	    
	   
	}
	
	
	
	
}
