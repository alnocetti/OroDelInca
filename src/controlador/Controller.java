package controlador;
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
	
	public void getLogin(UsuarioDTO dto) throws UsuarioException{
		UsuarioDTO nuevo = UsuarioDAO.getInstance().getUsuarioByName(dto.getNombre()).toDTO();
		if (dto.getClave().equals(nuevo.getClave())){
			Principal principal = new Principal();
			principal.setVisible(true);
			login.setVisible(false);
		}
		return;
	}
	
	public void agregarUsuario(UsuarioDTO usuarioDTO) throws  UsuarioException{
		UsuarioDAO.getInstance().insertUsuario(usuarioDTO);
		return;
	}
			
}
