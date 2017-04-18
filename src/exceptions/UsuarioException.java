package exceptions;


public class UsuarioException extends Exception {
	
	/**
	 * Yo soy una excepcion, la representacion de un comportamiento anómalo.
	 * 
	 * */

	private static final long serialVersionUID = 5172659793563705509L;

	public UsuarioException(String mensaje){
		super(mensaje);
	}
}


