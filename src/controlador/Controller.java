package controlador;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.hibernate.HibernateException;

import dao.UsuarioDAO;
import dto.UsuarioDTO;
import exceptions.UsuarioException;
import vista.Login;
import vista.Principal;

public class Controller {
	private static Login login;
	private static Controller instance;
	
	private Controller(){}
	
	public static Controller getInstance(){
		if (instance == null)
			instance = new Controller();
		return instance;
	}
	
	public static void main(String[] args)
	{
		new Controller();
		login = new Login();
		login.setVisible(true);
	}
	
	public UsuarioDTO getUsuarioByID(int idUsuario) throws UsuarioException{
		return UsuarioDAO.getInstance().getUsuarioById(idUsuario).toDTO();
	}
	
	public void getLogin(UsuarioDTO dto) throws UsuarioException, NoSuchAlgorithmException{
		UsuarioDTO nuevo = UsuarioDAO.getInstance().getUsuarioByName(dto.getNombre()).toDTO();
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(dto.getClave().getBytes(StandardCharsets.UTF_8));			
		dto.setClave(Base64.getEncoder().encodeToString(hash));
		
		if (dto.getClave().equals(nuevo.getClave())){
			Principal principal = new Principal();
			principal.setVisible(true);
			login.setVisible(false);
		}else{
			throw new UsuarioException("Password o usuario incorrectos");
		}
			
		return;
	}
	
	public void agregarUsuario(UsuarioDTO usuarioDTO) throws  UsuarioException, HibernateException, NoSuchAlgorithmException{
		UsuarioDAO.getInstance().insertUsuario(usuarioDTO);
		return;
	}
			
}
