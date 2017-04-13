package modelo;

import javax.persistence.*;

@Table(name = "usuairos")
public class Usuario {
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	@Column(name="password")
	private String clave;
	
	public Usuario(String nombre, String apellido, int idUsuario, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
		this.clave = clave;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
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

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
