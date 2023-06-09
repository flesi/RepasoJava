
public class Aspirante {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String departamento;
    private String puesto;
    
	public Aspirante(int id, String nombre, String apellido, String email, String genero, String departamento,
			String puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
		this.departamento = departamento;
		this.puesto = puesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Aspirante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", genero=" + genero + ", departamento=" + departamento + ", puesto=" + puesto + "]";
	}
    
    
    
}
