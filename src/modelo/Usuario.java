package modelo;


import dto.UsuarioDTO;
import entities.UsuarioEntity;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private int idUsuario;
	private String password;
	
	public Usuario(String nombre, String apellido, int idUsuario, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
		this.password = password;
	}
	
	public Usuario(UsuarioEntity ue){
		this.nombre = ue.getNombre();
		this.apellido = ue.getApellido();
		this.idUsuario = ue.getIdUsuario();
		this.password = ue.getClave();
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
		return password;
	}

	public void setClave(String clave) {
		this.password = clave;
	}
	
	public Usuario fromDTOToUsuario(UsuarioDTO usuarioDTO){
		Usuario usuario = new Usuario();
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setIdUsuario(usuarioDTO.getIdUsuario());
		usuario.setClave(usuarioDTO.getClave());
		return usuario;	
	}
	
	public UsuarioDTO toDTO(){
		return new UsuarioDTO(nombre,apellido,idUsuario,password);
	}
	
	public boolean getLogin(int idUsu,String pass){
		if (this.idUsuario == idUsu && this.password.equals(pass))
			return true;
		return false;
	}
	

}
