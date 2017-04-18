package entities;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuarioEntity {
	private String nombre;
	private String apellido;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	private String password;
	
	public UsuarioEntity(String nombre, String apellido, int idUsuario, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
		this.password = clave;
	}

	public UsuarioEntity() {
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
		return password;
	}

	public void setClave(String clave) {
		this.password = clave;
	}
	

	
}
