
public class Verdura extends Alimento {
	private float peso;
	private String tipo;
	private float porcentajeFibra;
	private String color;
	
	public Verdura(String nombre, String descripcion, float peso, String tipo, float porcentajeFibra, String color) {
		super(nombre, descripcion);
	}
	
	public void setPeso(float p) {
		this.peso = p;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setPorcentajeFibra(float pf) {
		this.porcentajeFibra = pf;
	}
	
	public float getPorcentajeFibra() {
		return this.porcentajeFibra;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return this.color;
	}

}
