
public class Carne extends Alimento {

	private boolean origenAnimal;
	private float porcentajeGrasa;
	private float porcentajeProteina;

	public Carne(String nombre, String descripcion, boolean origenAnimal, float porcentajeGrasa, float porcentajeProteina) {
		super(nombre, descripcion);

	}
	
	public void setOrigenAnimal(boolean o) {
		this.origenAnimal = o;
	}
	
	public boolean getOrigenAnimal() {
		return this.origenAnimal;
	}
	
	public void setPorcentajeGrasa(float pg) {
		this.porcentajeGrasa = pg;
	}
	
	public float getPorcentajeGrasa(float pg) {
		return this.porcentajeGrasa;		
	}
	
	public void setPorcentajeProteina(float pg) {
		this.porcentajeProteina = pg;
	}
	
	public float getPorcentajeProteina() {
		return this.porcentajeProteina;
	}

}
