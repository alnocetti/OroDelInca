package controlador;

import modelo.*;
import vista.*;

public class Controller {
	
	public static void main(String[] args)
	{
		new Controller();
	}
	
	public Controller(){
		iniciar();
	}
	
	private void iniciar(){
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}
	
	public void agregarCliente(Cliente cliente){
		
	}
	
	public boolean getLogin(UsuarioView usuarioView){
		return false;
	}
	
	public Usuario fromViewToUsuario(UsuarioView usuarioView){
		Usuario usuario = new Usuario();
		usuario.setApellido(usuarioView.getApellido());
		usuario.setNombre(usuarioView.getNombre());
		usuario.setIdUsuario(usuarioView.getIdUsuario());
		usuario.setClave(usuarioView.getClave());
		return usuario;
		
	}
}
