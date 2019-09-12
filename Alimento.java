public class Alimento {
	private String nombre;
	private String descripcion;
	
	public Alimento(String nombre, String descripcion) {
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setDescripcion(String d) {
		this.descripcion = d;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
