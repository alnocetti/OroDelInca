package controlador;

import modelo.Cliente;
import vista.Principal;

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
}
