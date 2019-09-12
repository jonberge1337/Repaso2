
public class Fruta extends Alimento {
	private float peso;
	private String tipo;
	private int calorias;
	private String color;
	
	public Fruta(String nombre, String descripcion, float peso, String tipo, int calorias, String color) {
		super(nombre, descripcion);
		setCalorias(calorias);
		setPeso(peso);
		setTipo(tipo);
		setColor(color);
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
	
	public void setCalorias(int c) {
		this.calorias = c;
	}
	
	public int getCalorias() {
		return this.calorias;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public String getColor(String color) {
		return this.color;
	}

}
