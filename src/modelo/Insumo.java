package modelo;

public class Insumo {
	
	private int idInsumo;
	private String nombre;
	
	public Insumo(){
	}
	
	public Insumo(int idInsumo, String nombre) {
		super();
		this.idInsumo = idInsumo;
		this.nombre = nombre;
	}

	public int getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(int idInsumo) {
		this.idInsumo = idInsumo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
