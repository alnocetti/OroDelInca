package controlador;

import java.util.HashSet;
import java.util.Set;

import modelo.Cliente;
import vista.Principal;

public class Controller {
	Set<Cliente> clientes;
	
	public static void main(String[] args)
	{
		new Controller();
	}
	
	public Controller(){
		this.clientes = new HashSet<Cliente>();
		iniciar();
	}
	
	private void iniciar(){
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}
	
	public void agregarCliente(Cliente cliente){
		if existeCliente
		
	}
	
	public Cliente buscarClientePorID(int idCliente){
		for(Cliente i : clientes){
			if(i.getIdCliente() == idCliente)
				return i;
		}
		return null;
	}
	
	public boolean existeCliente(Cliente cliente){
		for(Cliente i : clientes){
			if(i.getIdCliente() == cliente.getIdCliente()){
				return true;
			}
		}
		return false;
	}
	
	
	
}
