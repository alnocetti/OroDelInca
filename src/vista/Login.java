package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Imagenes.*;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.UIManager;
import java.awt.Panel;
import java.awt.SystemColor;


public class Login extends JFrame {

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
		btnIngresar.setBounds(172, 206, 89, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblVersion = new JLabel("Versi\u00F3n 1.0");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblVersion.setBounds(369, 248, 65, 14);
		contentPane.add(lblVersion);

	}
}
