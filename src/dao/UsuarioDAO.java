package dao;

import hibernate.HibernateUtil;
import modelo.Usuario;

import org.hibernate.SessionFactory;

import entities.UsuarioEntity;
import exceptions.UsuarioException;

import org.hibernate.Session;

public class UsuarioDAO {
	

	/** Yo soy un DAO, asi que no tengo estado, mas que las variable que necesito para instanciarme.
	 *  Nunca voy a tener un método de negocio dentro mio
	 * */
	
	private static UsuarioDAO instancia;
	
	private UsuarioDAO() {}
	
	public static UsuarioDAO getInstance() {
		if(instancia == null)
			instancia = new UsuarioDAO();
		return instancia;
	}

	public Usuario getUsuarioById(int idUsuario) throws UsuarioException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		//UsuarioEntity ue = new UsuarioEntity();
		UsuarioEntity ue = (UsuarioEntity) session.get(UsuarioEntity.class, "idUsuario");
					
		if(ue != null)
			return new Usuario(ue);
		else 
			throw new UsuarioException("El usuario solicitado no existe");
	}
	
public Usuario getUsuarioByName(String nombre) throws UsuarioException {	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		//UsuarioEntity ue = new UsuarioEntity();
		UsuarioEntity ue = (UsuarioEntity) session.createQuery("from UsuarioEntity u where u.nombre = ?")
				.setParameter(0, nombre)
				.uniqueResult();			
		if(ue != null)
			return new Usuario(ue);
		else 
			throw new UsuarioException("El usuario solicitado no existe");
	}

}
	

