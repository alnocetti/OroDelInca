package vista;


import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controller;
import dto.UsuarioDTO;
import exceptions.UsuarioException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;


public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imagenes/BEING00I.jpg")));
		setTitle("Oro del Inca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(189, 37, 54, 22);
		contentPane.add(lblUsuario);
		
		JLabel lblIdUsuario = new JLabel("ID");
		lblIdUsuario.setEnabled(false);
		lblIdUsuario.setLabelFor(lblIdUsuario);
		lblIdUsuario.setBounds(275, 76, 120, 14);
		contentPane.add(lblIdUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 159, 97, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(180, 115, 73, 22);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(168, 70, 97, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				UsuarioDTO dto = new UsuarioDTO();
				dto.setNombre(textField.getText());
				dto.setClave(passwordField.getText());
				try {
					Controller.getInstance().getLogin(dto);
				} catch (UsuarioException | NoSuchAlgorithmException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			}
		});
		btnIngresar.setBounds(172, 206, 89, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblVersion = new JLabel("Versi\u00F3n 1.0");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblVersion.setBounds(369, 248, 65, 14);
		contentPane.add(lblVersion);

	}
}
