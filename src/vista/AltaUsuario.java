package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import org.hibernate.HibernateException;

import controlador.Controller;
import dto.UsuarioDTO;
import exceptions.UsuarioException;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AltaUsuario extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AltaUsuario() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 11, 48, 20);
		add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 42, 48, 20);
		add(lblApellido);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 73, 59, 20);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(86, 11, 106, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(86, 42, 106, 20);
		add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 73, 106, 20);
		add(passwordField);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDTO ud = new UsuarioDTO();
				ud.setNombre(textField.getText());
				ud.setApellido(textField_1.getText());
				ud.setClave(passwordField.getText());
				//final JPanel panel = new JPanel();
				try {
					Controller.getInstance().agregarUsuario(ud);
					JOptionPane.showMessageDialog(null, "Usuario guardado", "Mensaje", 1);
					textField.setText("");
					textField_1.setText("");
					
				} catch (UsuarioException e1) {					
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					
					e1.printStackTrace();
				} catch (HibernateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGuardar.setBounds(10, 106, 89, 23);
		add(btnGuardar);
				

	}
}
