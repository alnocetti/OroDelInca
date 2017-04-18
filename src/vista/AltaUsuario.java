package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controller;
import dto.UsuarioDTO;
import exceptions.UsuarioException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textLastName;
	private JTextField txtAuto;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AltaUsuario() {
		setTitle("Alta usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 213, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 33, 47, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 58, 47, 14);
		contentPane.add(lblApellido);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(10, 83, 47, 14);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 108, 57, 14);
		contentPane.add(lblPassword);
		
		textName = new JTextField();
		textName.setBounds(75, 30, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setBounds(75, 55, 86, 20);
		contentPane.add(textLastName);
		textLastName.setColumns(10);
		
		txtAuto = new JTextField();
		txtAuto.setText("Auto");
		txtAuto.setEditable(false);
		txtAuto.setBounds(75, 80, 86, 20);
		contentPane.add(txtAuto);
		txtAuto.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(75, 105, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioDTO ud = new UsuarioDTO();
				ud.setNombre(textName.getText());
				ud.setApellido(textLastName.getText());
				ud.setClave(passwordField.getText());
				try {
					Controller.getInstance().agregarUsuario(ud);
				} catch (UsuarioException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 146, 78, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setBounds(98, 146, 89, 23);
		contentPane.add(btnCancelar);
	}
}
