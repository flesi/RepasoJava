package gES;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		//PATH
//		toString(): devuelve la representación de cadena de la ruta.
//		getFileName(): devuelve el nombre del archivo o directorio al final de la ruta.
//		getParent(): devuelve el directorio principal de la ruta.
//		resolve(): combina la ruta actual con otra ruta o una cadena para crear una nueva ruta.
//		normalize(): normaliza la ruta, eliminando cualquier redundancia o referencia a directorios actuales (.) o directorios superiores (..).
//		toAbsolutePath(): convierte la ruta en una ruta absoluta.
//		toFile(): Convierte un objeto Path en un objeto File. Esto puede ser útil si necesitas utilizar métodos específicos de File en un contexto donde se requiere un objeto File.
//		toUri(): Devuelve la representación de la ruta como un objeto URI.
//		isAbsolute(): Verifica si la ruta actual es absoluta.
//		relativize(Path other): Crea una ruta relativa entre la ruta actual y otra ruta especificada.
//		startsWith(Path other) y endsWith(Path other): Verifica si la ruta actual comienza o termina con la ruta especificada.

		Path path = Paths.get("ruta/al/archivo.txt");
		
		System.out.println("Ruta: " + path.toString());
		System.out.println("Nombre del archivo: " + path.getFileName());
		System.out.println("Directorio principal: " + path.getParent());
		System.out.println("Ruta absoluta: " + path.toAbsolutePath());
		System.out.println("Ruta normalizada: " + path.normalize());
		
		String fileName = path.getFileName().toString(); //Obtiene el nombre del archivo
		Path parentDir = path.getParent(); // Obtiene el directorio padre
		Path resolvedPath = path.resolve("otroArchivo.txt"); // Resuelve la ruta relativa "otroArchivo.txt" respecto a la ruta actual

		//FILE
//		exists(): Verifica si el archivo o directorio existe.
//		isDirectory(): Verifica si el objeto representa un directorio.
//		createNewFile(): Crea un nuevo archivo en la ruta especificada.
//		delete(): Elimina el archivo o directorio.
//		renameTo(File dest): Renombra el archivo o directorio representado por el objeto a un nuevo nombre especificado por dest.
//		list(): Devuelve un array de cadenas que contiene los nombres de los archivos y directorios en el directorio representado por el objeto File.
//		listFiles(): Devuelve un array de objetos File que representa los archivos y directorios en el directorio representado por el objeto File.
//		mkdir(): Crea un directorio en la ruta especificada.
//		listRoots(): Devuelve un array de objetos File que representan las raíces de los sistemas de archivos disponibles.
		
		File file = new File("ruta/al/archivo.txt");
		File file2 = new File(path.toString());
		
		
		boolean exists = file.exists();
		boolean isDirectory = file.isDirectory();
		boolean created = file.createNewFile();
		boolean deleted = file.delete();
		boolean renamed = file.renameTo(new File("nuevoNombre.txt"));
		
		//FILES
//		copy(Path source, Path target): Copia un archivo o directorio de la ruta de origen a la ruta de destino.
//		move(Path source, Path target): Mueve un archivo o directorio de la ruta de origen a la ruta de destino.
//		delete(Path path): Elimina un archivo o directorio en la ruta especificada.
//		readAllBytes(Path path): Lee todos los bytes de un archivo y los devuelve como un array de bytes.
//		write(Path path, byte[] bytes): Escribe los bytes proporcionados en un archivo.
//		isRegularFile(Path path): Verifica si el archivo representado por la ruta especificada es un archivo regular.
//		isDirectory(Path path): Verifica si el archivo representado por la ruta especificada es un directorio.
//		size(Path path): Devuelve el tamaño en bytes del archivo representado por la ruta especificada.
//		walk(Path start, FileVisitOption... options): Realiza un recorrido (traversal) de los archivos y subdirectorios en un árbol de directorios a partir de la ruta de inicio.
		
		Path source = Paths.get("ruta/al/archivo.txt");
		Path destination = Paths.get("ruta/destino/archivo.txt");
		Files.copy(source, destination);
		Files.move(source, destination);
		Files.delete(source);
		byte[] bytes = Files.readAllBytes(source);
		Files.write(destination, bytes);

//		Files.readAllLines() 
//		lee el archivo especificado por la ruta path y devuelve una lista de cadenas (List<String>) 
//		donde cada elemento de la lista representa una línea del archivo.
		
		try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
//		 leer un archivo utilizando BufferedReader y Path
		 try (BufferedReader reader = Files.newBufferedReader(path)) {
	            String linea;
	            while ((linea = reader.readLine()) != null) {
	                System.out.println(linea);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		 Path folderPath = Paths.get("ruta/de/la/carpeta");
//		 listar los archivos y directorios contenidos en una carpeta utilizando las clases Path y Files
		 try (DirectoryStream<Path> stream = Files.newDirectoryStream(folderPath)) {
	            for (Path filePath : stream) {
	                if (Files.isDirectory(filePath)) {
	                    System.out.println("Directorio: " + filePath.getFileName());
	                } else {
	                    System.out.println("Archivo: " + filePath.getFileName());
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		 

	}

}
