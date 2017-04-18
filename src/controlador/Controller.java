package controlador;
import dao.UsuarioDAO;
import dto.UsuarioDTO;
import exceptions.UsuarioException;
import vista.Login;
import vista.Principal;

public class Controller {
	
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
		Login login = new Login();
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
		}
		return;
	}
			
}
