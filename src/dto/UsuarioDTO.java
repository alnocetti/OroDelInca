package dto;

import entities.UsuarioEntity;

public class UsuarioDTO {
	private String nombre;
	private String apellido;
	private int idUsuario;
	private String password;
	public UsuarioDTO(String nombre, String apellido, int idUsuario, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
		this.password = clave;
	}
	public UsuarioDTO() {
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
	
	public UsuarioEntity toEntity(){
		UsuarioEntity ue = new UsuarioEntity();
		ue.setNombre(nombre);
		ue.setApellido(apellido);
		ue.setClave(password);
		return ue;
	}
	

}
